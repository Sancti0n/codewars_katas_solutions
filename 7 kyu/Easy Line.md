https://www.codewars.com/kata/56e7d40129035aed6c000632

## Python
```py
import math

def easyline(n):
    i, s = [0,0]
    while i <= n:
        s += math.comb(n, i)**2
        i += 1
    return s
```