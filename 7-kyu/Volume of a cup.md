https://www.codewars.com/kata/56a13035eb55c8436a000041

## Python
```python
from math import *

def cup_volume(d1, d2, height):
    return round(pi*height*(d1**2 + d2**2 + d1*d2)/12, 2)
```

## JavaScript
```js
function cupVolume(d1, d2, height) {
  return Math.round(Math.PI*height*(d1**2 + d2**2 + d1*d2)/0.12)/100
}
```