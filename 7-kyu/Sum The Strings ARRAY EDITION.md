https://www.codewars.com/kata/5966ffb962d030e11a00005a

## JavaScript
```js
function sumArr(a,b) {
  let t = [], c = 0, d = 0;
  for (let i=0;i<5;i++) {
    c = a[i] == "" ? 0 : parseInt(a[i]);
    d = b[i] == "" ? 0 : parseInt(b[i]);
    t.push((c + d).toString())
  }
  return t
}
```