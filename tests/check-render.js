const fs = require('fs');
const vm = require('vm');

const html = fs.readFileSync(process.argv[2], 'utf8');
const s = html.indexOf('<script>') + '<script>'.length;
const e = html.lastIndexOf('</script>');
const code = html.slice(s, e);

const makeEl = () => ({
  innerHTML: '', textContent: '', style: {}, dataset: {}, hidden: false, value: '', id: '',
  classList: { add() {}, contains() { return false; } },
  addEventListener() {}, appendChild() {}, setAttribute() {}, closest() { return null; },
  querySelector() { return makeEl(); }
});

const ctx = {
  console,
  document: { querySelector: () => makeEl(), createElement: () => makeEl(), head: { appendChild() {} } },
  localStorage: { getItem: () => null, setItem() {}, removeItem() {} },
  location: { hash: '' },
  window: { addEventListener() {}, scrollTo() {} },
  URL: { createObjectURL: () => 'blob:x', revokeObjectURL() {} },
  Blob: function Blob() {},
  Worker: function Worker() {},
  setTimeout, clearTimeout, setInterval, clearInterval
};
ctx.makeEl = makeEl;
vm.createContext(ctx);

let errors = 0;
try {
  vm.runInContext(code, ctx);
  console.log('script loaded and start view rendered');
} catch (err) {
  errors++;
  console.log('LOAD ERROR:', err.message);
}

const routes = vm.runInContext('ROUTES', ctx);
for (const r of routes) {
  ctx.location.hash = '#' + r;
  try {
    vm.runInContext('render()', ctx);
  } catch (err) {
    errors++;
    console.log('render error on', r, '-', err.message);
  }
}
console.log('routes rendered:', routes.length);

const n = vm.runInContext('TOPICS.length', ctx);
for (let i = 0; i < n; i++) {
  try {
    vm.runInContext(`if (TOPICS[${i}].steps || TOPICS[${i}].renderer === 'net') mountPlayer(makeEl(), TOPICS[${i}]);`, ctx);
  } catch (err) {
    errors++;
    console.log('player error on topic', i, '-', err.message);
  }
}
try {
  vm.runInContext("mountScale(makeEl());", ctx);
} catch (err) {
  errors++;
  console.log('scale error -', err.message);
}
try {
  vm.runInContext("practiceFilter = 'graphs'; render();", ctx);
  vm.runInContext("practiceFilter = 'all';", ctx);
} catch (err) {
  errors++;
  console.log('practice filter error -', err.message);
}

console.log(errors === 0 ? 'RENDER CHECKS PASSED' : 'RENDER ERRORS: ' + errors);
