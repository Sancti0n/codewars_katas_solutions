https://www.codewars.com/kata/5b71af678adeae41df00008c

## Python
```python
import math

def shortest_distance(a, b, c):
    return min(math.sqrt(a**2 + (b+c)**2), math.sqrt(b**2 + (a+c)**2), math.sqrt(c**2 + (b+a)**2))
```

## JavaScript
```js
function shortestDistance(a, b, c) {
  return Math.min(Math.sqrt(a**2 + (b+c)**2), Math.sqrt(b**2 + (a+c)**2), Math.sqrt(c**2 + (b+a)**2))
}
```