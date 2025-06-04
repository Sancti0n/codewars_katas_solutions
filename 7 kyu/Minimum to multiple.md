https://www.codewars.com/kata/5e030f77cec18900322c535d

## JavaScript
```js
function minimum(a, x) {
  let c = 0, a1 = a, a2 = a;
  while (!Number.isInteger(a1/x) && !Number.isInteger(a2/x)) {
    c++;
    a1 += 1;
    a2 -= 1;
  }
  return c
}
```

## Python
```python
from math import *

def minimum(a, x):
    a1 = ceil(a/x)*x
    a2 = int(a/x)*x
    return min(abs(a1-a), abs(a2-a))
```