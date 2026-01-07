https://www.codewars.com/kata/550fac5249073256380002c0

## JavaScript
```js
function reverseFibo(n) {
  let a = 0, b = 1, i = 2, s = "10", temp = 0;
  while (i<n) {
    s = b + a + s;
    temp = b;
    b = a + b;
    a = temp;
    i++;
  }
  return n<3 ? s.slice(0, n) : s
}
```