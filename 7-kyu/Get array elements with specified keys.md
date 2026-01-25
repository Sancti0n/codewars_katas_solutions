https://www.codewars.com/kata/586a3270c66d18ad810001d4

## JavaScript
```js
Array.prototype.only = function(keys) {
  keys.sort((a, b)=>a-b);
  let t = [];
  for (let i=0;i<keys.length;i++) {
    t.push(this[keys[i]]);
  }
  return t
}
```