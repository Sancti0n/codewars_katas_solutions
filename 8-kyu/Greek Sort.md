https://www.codewars.com/kata/56bc1acf66a2abc891000561

## Python
```py
from preloaded import greek_alphabet

def greek_comparator(lhs, rhs):
    a = greek_alphabet.index(lhs)
    b = greek_alphabet.index(rhs)
    return -1 if a < b else 0 if a == b else 1
```