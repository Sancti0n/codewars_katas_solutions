https://www.codewars.com/kata/52ece9de44751a64dc0001d9

## JavaScript
```js
function binToInt(a) {
  let r = 0;
  for(let i=0;i<a.length;i++) {
    r = r * 2 + (a[i] == '1' ? 1 : 0);
  }
  return r
}

function calculate(num1, num2) {
  return binToInt(num1) + binToInt(num2)
}
```