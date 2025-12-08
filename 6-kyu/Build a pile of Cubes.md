https://www.codewars.com/kata/5592e3bd57b64d00f3000047

## JavaScript
```js
function findNb(m) {
  let n = 0;
  while ((n*(n+1)/2)**2 <= m) {
    if ((n*(n+1)/2)**2 == m) return n;
    else n++;
  }
  return -1
}
```