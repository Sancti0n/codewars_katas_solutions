https://www.codewars.com/kata/5b3e609cd58499284100007a

## Python
```python
import math

def product_sans_n(nums):
    t = []
    for i in range(len(nums)):
        t.append(math.prod(nums[:i]+nums[i+1:]))
    return t
```