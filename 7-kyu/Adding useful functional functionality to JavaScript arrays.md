https://www.codewars.com/kata/52195c9bb576caf14200007f

## JavaScript
```js
Array.range = function(start, count) {
  let t = [], c = 0;
  while (c<count) {
    t.push(start);
    start++;
    c++;
  }
  return t
}

Array.prototype.sum = function() {
  let c = 0;
  for (let i=0;i<this.length;i++) {
    c += this[i];
  }
  return c;
}
```