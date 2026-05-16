https://www.codewars.com/kata/52b74e0936d582d9210005ff

## JavaScript
```js
String.prototype.reverse = function() {
  let w = '';
  for (let i=this.length-1;i>=0;i--) w += this[i];
  return w
}
```