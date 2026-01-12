https://www.codewars.com/kata/56bdf9d50d0b6433df001074

## JavaScript
```js
Array.prototype.sum = function() {
  let s = 0;
  for (let i=0;i<this.length;i++) {
    s += this[i];
  }
  return s
}
```