// Consolidated checker: data sanity, every step generator, and every practice test run by the page's own worker source.
const fs = require('fs');
const vm = require('vm');

const html = fs.readFileSync(process.argv[2], 'utf8');
const start = html.indexOf('<script>') + '<script>'.length;
const end = html.indexOf('/* ---------- Page logic');
const dataCtx = { console };
vm.createContext(dataCtx);
vm.runInContext(html.slice(start, end) + '\n;this.__T = TOPICS; this.__P = PROBLEMS;', dataCtx);
const TOPICS = dataCtx.__T;
const PROBLEMS = dataCtx.__P;

let issues = 0;
const fail = (msg) => { issues++; console.log('ISSUE: ' + msg); };

const topicIds = new Set(TOPICS.map((t) => t.id));
if (topicIds.size !== TOPICS.length) fail('duplicate topic ids');
const ids = new Set();
for (const p of PROBLEMS) {
  if (ids.has(p.id)) fail('duplicate problem id ' + p.id);
  ids.add(p.id);
  if (!topicIds.has(p.topic)) fail('unknown topic on ' + p.id);
  if (!['Easy', 'Medium', 'Hard'].includes(p.level)) fail('bad level on ' + p.id);
  if (!p.tests || !p.tests.length) fail('no tests on ' + p.id);
}
for (const t of TOPICS) {
  if (typeof t.steps === 'function') {
    try { if (!t.steps().length) fail('empty steps on ' + t.id); }
    catch (e) { fail('steps error on ' + t.id + ': ' + e.message); }
  }
}

const runnerSrc = vm.runInNewContext('`' + html.match(/const RUNNER_SRC = `([\s\S]*?)`;/)[1] + '`');
let tests = 0;
for (const p of PROBLEMS) {
  let posted = null;
  const wctx = { console, self: { postMessage: (r) => { posted = r; } }, __data: { code: p.solution, name: p.fn, tests: p.tests } };
  vm.createContext(wctx);
  try {
    vm.runInContext(runnerSrc, wctx);
    vm.runInContext('self.onmessage({ data: __data });', wctx, { timeout: 3000 });
  } catch (e) { fail(p.id + ' runner threw or timed out: ' + e.message); continue; }
  if (!posted || posted.length !== p.tests.length) { fail(p.id + ': no full result'); continue; }
  tests += posted.length;
  posted.forEach((r, i) => { if (!r.pass) fail(`${p.id} test ${i + 1}: ${r.error || 'got ' + r.got + ', expected ' + r.expect}`); });
}

for (const t of TOPICS) console.log(t.id.padEnd(22), String(PROBLEMS.filter((p) => p.topic === t.id).length).padStart(3));
console.log(`problems ${PROBLEMS.length}, tests ${tests}`);
console.log(issues === 0 ? 'ALL CHECKS PASSED' : `ISSUES: ${issues}`);
