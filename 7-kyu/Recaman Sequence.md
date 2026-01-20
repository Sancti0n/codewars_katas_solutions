https://www.codewars.com/kata/5c3f31c2460e9b4020780aa2

## JavaScript
```js
function recaman(n) {
  let t = [0];
  for (let i=1;i<=n;i++) {
    if (t[i-1]>=i && t.indexOf(t[i-1]-i)<0) t.push(t[i-1]-i);
    else t.push(t[i-1]+i);
  }
  return t[n]
}
```