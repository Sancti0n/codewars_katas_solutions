https://www.codewars.com/kata/55a1528cca4a6d4c5a0000e3

## JavaScript
```js
function defaultExample(...t) {
  let s = 0;
  if (t.length === 1) return t[0]+7
  for (let i=0;i<t.length;i++) s += t[i];
  return s
}

function restExample(...t) {
  return t[0]*(t.length-1);
}

function spreadExample(...t) {
  let s = 0;
  for (let i=0;i<t.length;i++) s += t[i];
  return s
}
```