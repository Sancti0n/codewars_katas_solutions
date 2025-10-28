https://www.codewars.com/kata/53222010db0eea35ad000001

## Python
```python
def get_slope(p1, p2):
    if p1 == p2 or p1[0] == p2[0]: return None
    return (p2[1]-p1[1])/(p2[0]-p1[0])
```

## JavaScript
```js
function getSlope(p1, p2) {
  return p1[0] == p2[0] ? null : (p2[1] - p1[1])/(p2[0] - p1[0])
}
```