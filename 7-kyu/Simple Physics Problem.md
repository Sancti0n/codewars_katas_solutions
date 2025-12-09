https://www.codewars.com/kata/57c3eb9fd6cf0ffd68000222

## Python
```py
def solveit(vi, vf, t):
    if vi>vf: return []
    a = (vf-vi)/t
    d = vi*t + .5*a*t*t
    return [round(a, 2), round(d, 2)]
```

## JavaScript
```js
function solveIt(vi, vf, t){
  if (vi>vf) return []
  let a = (vf-vi)/t;
  let d = vi*t + .5*a*t*t;
  return [Math.round(a*100)/100, Math.round(d*100)/100]
}
```