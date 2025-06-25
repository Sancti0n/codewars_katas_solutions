https://www.codewars.com/kata/5884d46015a70f6cd7000035

## JavaScript
```js
function inter(s1, s2) {
  let t = [];
  for (const v of s1) {
    if (s2.has(v)) t.push(v);
  }
  for (const v of s2) {
    if (s1.has(v) && t.indexOf(v)<0) t.push(v);
  }
  return new Set(t)
}
```