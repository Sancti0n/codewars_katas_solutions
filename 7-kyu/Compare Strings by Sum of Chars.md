https://www.codewars.com/kata/576bb3c4b1abc497ec000065

## Python
```python
import string

def coutInLoop(arr, s):
    l = list(string.ascii_uppercase)
    if arr is not None:
        for i in arr.upper():
            if i in l:
                s += ord(i)
            else:
                s = 0
                break
    return s

def compare(s1, s2):
    return coutInLoop(s1, 0) == coutInLoop(s2, 0)
```