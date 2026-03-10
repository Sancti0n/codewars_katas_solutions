https://www.codewars.com/kata/555a77eb65dd419534000016

## JavaScript
```js
function sometimes(fn) {
  let c = 0
  return function(...args) {
    c++;
    if (c<4) return fn(...args)
    if (c >= 4 && c%2<1) return "hmm, I don't know!"
    return fn(...args)
  };
}
```