https://www.codewars.com/kata/53b2ff49b82af296ce001139

## JavaScript
```js
Array.prototype.reverse = function() {
  var arr = this.splice(0);
  while(arr.length) {
    this.push(arr.pop());
  }
  return this;
};
```