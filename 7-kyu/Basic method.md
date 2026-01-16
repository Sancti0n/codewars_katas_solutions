https://www.codewars.com/kata/55da49c166949c319200003e

## JavaScript
```js
Array.prototype.max = function() {
  let m = 0;
  for (let i=0;i<this.length;i++) {
    if (i==0) {
      if (!isNaN(this[i])) m = +this[i];
      else return NaN
    }
    else {
      if (isNaN(this[i])) return NaN
      if (m<+this[i]) m = +this[i];
    }
  }
  return m
}
```