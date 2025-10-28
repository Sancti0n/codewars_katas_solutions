https://www.codewars.com/kata/566afbfc8595f2e751000040

## Python
```python
import math

def sum_mult_triangnum(n, m):
    t = [int(i*(i+1)/2) for i in range(1, n+1)]
    return int(math.lcm(*t))*int(m*(m+1)/2)
```