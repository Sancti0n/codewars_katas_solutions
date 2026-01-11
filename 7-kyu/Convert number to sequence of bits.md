https://www.codewars.com/kata/56536e45bd4717003a000056

## JavaScript
```js
Number.prototype.toBits = function(length=8) {
  let one = this.toString(2) , zero = "";
  if (length-one.length>0) {
    zero = '0'.repeat(length-one.length);
  }
  return zero + one;
}
```