https://www.codewars.com/kata/5cd12646cf44af0020c727dd

## Python
```python
from math import *

def square_pi(digits):
    v = 31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679
    s, i = 0, 0
    while i<digits:
        s += int(str(v)[i])**2
        i += 1
    return ceil(s**.5)
```