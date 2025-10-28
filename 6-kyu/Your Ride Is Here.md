https://www.codewars.com/kata/55491e9e50f2fc92f3000074

## Python
```python
import string

def ride(group, comet):
    l = list(string.ascii_uppercase)
    s1, s2 = [1,1]
    for i in group: s1 *= l.index(i) + 1
    for j in comet: s2 *= l.index(j) + 1
    return "GO" if s1%47 == s2%47 else "STAY"
```