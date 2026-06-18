https://www.codewars.com/kata/56e6a330715e7221d9000a3b

## JavaScript
```js
Number.prototype.times = function (f) {
  let i = 0;
  for (let i=0;i<this;i++) {
    f(i);
  }
}
```