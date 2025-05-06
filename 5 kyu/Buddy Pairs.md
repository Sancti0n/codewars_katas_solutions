https://www.codewars.com/kata/59ccf051dcc4050f7800008f

## Python
```python
from math import isqrt

def div(n):
    r, div = [1, 1]
    while True:
        for div in range(div + 1, isqrt(n) + 1):
            if not n % div:
                mul = 1
                while not n % div:
                    n //= div
                    mul = 1 + mul * div
                r *= mul
                break
        else:
            if n > 1:
                r *= 1 + n
            return r

def buddy(start, limit):
    def s(n): return div(n) - n
    for n in range(start, limit + 1):
        m = s(n) - 1
        if m > n and s(m) == n + 1: return [n, m]
    return 'Nothing'
```