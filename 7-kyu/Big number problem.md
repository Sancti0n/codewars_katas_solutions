https://www.codewars.com/kata/55f2f64faa2ffb24f6000005

## JavaScript
```js
function getNumberLength(n) {
  if (isNaN(n) || n<0) return "wrong input"
  let nb = n.toString(), v = nb.split("e+");
  if (v.length>1) {
    nb = 1 + parseInt(v[1])
  }
  else {
    nb = nb.length
  }
  return nb > 21 ? nb : "wrong input"
}
```