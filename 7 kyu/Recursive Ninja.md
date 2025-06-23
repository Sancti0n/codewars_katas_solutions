https://www.codewars.com/kata/583ed487ee36e2a8d20000e8

## JavaScript
```js
function chirp(n) {
  if (n==1) return "chirp"
  else return 'chirp-'+chirp(n-1)
}
```