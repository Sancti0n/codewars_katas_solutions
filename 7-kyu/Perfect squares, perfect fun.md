https://www.codewars.com/kata/5705ca6a41e5be67720012c0

## Python
```python
import math

def square_it(digits):
    w = ''
    d = str(digits)
    if len(d) == int(math.sqrt(len(d)))**2:
        i = 0
        e = int(math.sqrt(len(d)))
        while i<e:
            if i+1==e: w += d[e*i:e*(i+1)]
            else: w += d[e*i:e*(i+1)]+"\n"
            i += 1
        return w
    return "Not a perfect square!"
```