https://www.codewars.com/kata/59c053f070a3b7d19100007e

## Python
```python
def distance_from_line(a, b, c):
    if a == b:
        return ((c[0]-a[0])**2 + (c[1]-a[1])**2)**.5
    m = a[0] if b[0]-a[0] == 0 else (b[1]-a[1])/(b[0]-a[0])
    B = a[1]-a[0]*m
    return abs(c[0]-m) if m == a[0] else abs(c[1]-m*c[0]-B)/((1+m**2)**.5)
```

## JavaScript
```js
function distanceFromLine(a, b, c) {
  if (a == b) return ((c[0]-a[0])**2 + (c[1]-a[1])**2)**.5
  let m = b[0]-a[0] == 0 ? a[0] : (b[1]-a[1])/(b[0]-a[0]);
  let B = a[1]-a[0]*m;
  return m == a[0] ? Math.abs(c[0]-m) : Math.abs(c[1]-m*c[0]-B)/((1+m**2)**.5)
}
```