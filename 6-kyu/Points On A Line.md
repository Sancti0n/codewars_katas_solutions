https://www.codewars.com/kata/53b7bc844db8fde50800020a

## Python
```python
def colinear(a, b, c):
    return (a[1]-b[1])*(b[0]-c[0]) != (b[1]-c[1])*(a[0]-b[0])
# 
def on_line(points):
    if len(points)<3: return True
    for i in range(1, len(points)-1):
        if colinear(points[i-1], points[i], points[i+1]): return False
    return True
```

## JavaScript
```js
function colinear(a, b, c) {
  return (a[1]-b[1])*(b[0]-c[0]) != (b[1]-c[1])*(a[0]-b[0])
}

function onLine(pts) {
  if (pts.length<3) return true
  for (let i=1;i<pts.length-1;i++) {
    if (colinear(pts[i-1], pts[i], pts[i+1])) return false
  }
  return true
}
```