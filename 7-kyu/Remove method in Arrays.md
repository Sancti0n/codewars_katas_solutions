https://www.codewars.com/kata/565d76490397dcf0e700001e

## JavaScript
```js
Array.prototype.remove = function(index) {
  if (isNaN(this[index])) return this
  this.splice(index, 1)
  return this;
};
```