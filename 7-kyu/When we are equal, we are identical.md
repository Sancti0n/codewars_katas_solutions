https://www.codewars.com/kata/60c47b07f24d000019f722a2

## Python
```py
import sys

def make_identical(*strng):
    return sys.intern(strng[0])
```