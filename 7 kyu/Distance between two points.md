https://www.codewars.com/kata/5a0b72484bebaefe60001867

## Python
```python
import math

def distance(p1, p2):
    if len(p1) != len(p2) or p1 == [] or p2 == []: return -1
    d = 0
    for i in range(len(p1)):
        d += (p2[i]-p1[i])**2
    return math.sqrt(d)
```