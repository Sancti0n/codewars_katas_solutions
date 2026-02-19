https://www.codewars.com/kata/56e20642ddeb0f4fac000344

## JavaScript
```js
Array.prototype.map = function(f) {
  let t = [];
  for (let i=0;i<this.length;i++) {
    t.push(f(this[i], i, this));
  }
  return t
}
```