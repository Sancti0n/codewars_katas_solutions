https://www.codewars.com/kata/59c0cdbd5fb133c82b00007d

## JavaScript
```js
function ensureEven(n) {
  let s = n < 0 ? -1 : 1;
  n = Math.abs(n);
  return s*2*Math.round(n/2);
}
```