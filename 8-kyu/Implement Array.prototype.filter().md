https://www.codewars.com/kata/56dd9b84fe5754786f0014f7

## JavaScript
```js
Array.prototype.filter = function (func) {
  let arr = this;
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (func(this[i])) t.push(arr[i]);
  }
  return t
}
```