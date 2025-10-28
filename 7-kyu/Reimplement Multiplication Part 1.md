https://www.codewars.com/kata/563cc8c1a3895d7d30000049

## JavaScript
```js
function mul(a, b) {
  if (a == 0 || b == 0) return 0
  let i = 1, m = a;
  while (i<b) {
    m += a;
    i++;
  }
  return m
}
```