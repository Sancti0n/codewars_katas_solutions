https://www.codewars.com/kata/5267faf57526ea542e0007fb

## JavaScript
```js
Math.round = function(number) {
  if (parseInt(number+0.5)>parseInt(number)) return parseInt(number)+1
  return parseInt(number)
};

Math.ceil = function(number) {
  if (parseInt(number) == number) return number
  return parseInt(number)+1
};

Math.floor = function(number) {
  return parseInt(number)
};
```