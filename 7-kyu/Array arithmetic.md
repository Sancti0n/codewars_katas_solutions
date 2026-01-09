https://www.codewars.com/kata/5645fda2956e462b5100005e

## JavaScript
```js
Array.prototype.valueOf = function () {
  return this.length ? this.reduce((x, y) => x + y) : 0;
};
```