https://www.codewars.com/kata/5884f4727987a2a561000147

## JavaScript
```js
function symDiff(s1, s2) {
  let t = new Set();
  for (let i of s1) {
    if (s2.has(i) == false) t.add(i);
  }
  for (let j of s2) {
    if (s1.has(j) == false) t.add(j);
  }
  return t
}
```