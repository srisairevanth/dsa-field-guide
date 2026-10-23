# Data Structures Field Guide

A single-page guide to data structures and algorithms, built around real-world cases.

- **Theory from basic to advanced** for each topic, with step-through demos and cost tables
- **245 practice problems**, including 50 each on arrays, strings, binary search and linked lists
- **An in-browser test runner**: write your solution, run it against the test cases, and see which ones pass

Solutions are written in JavaScript. Progress and code drafts are saved in your browser, so they stay on that device.

**Live page:** https://srisairevanth.github.io/dsa-field-guide/

## Run the checks

The checks need only Node.js, with nothing to install:

```
node tests/check-all.js index.html
node tests/check-render.js index.html
```

`check-all.js` runs every problem's worked solution through the page's own test runner. `check-render.js` renders every view and the interactive demos against a stubbed DOM.

## Files

- `index.html`: the whole guide, with HTML, CSS and JavaScript in one file
- `tests/`: the two check scripts above
