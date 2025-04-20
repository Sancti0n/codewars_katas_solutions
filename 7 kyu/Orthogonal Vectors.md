https://www.codewars.com/kata/53670c5867e9f2222f000225

## Python
```python
def is_orthogonal(u, v):
    s = 0
    for i in range(len(u)):
        s += u[i]*v[i]
    return s == 0
```

## JavaScript
```js
function isOrthogonal(u,v) {
  let s = 0;
  for (let i=0;i<u.length;i++) {
    s += u[i]*v[i];
  }
  return s == 0
}
```