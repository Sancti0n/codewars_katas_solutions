https://www.codewars.com/kata/56d0a591c6c8b466ca00118b

## JavaScript
```js
function isTriangular(t) {
  for (let i=0;i<=(t*2)**.5;i++) {
    if (i*(i+1)/2 == t) return true
  }
  return false
}
```

## Python
```python
from math import *

def is_triangular(t):
    for i in range(ceil((t*2)**.5)):
        if i*(i+1)/2 == t: return True
    return False
```