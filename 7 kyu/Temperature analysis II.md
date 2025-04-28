https://www.codewars.com/kata/588e10c5f051b147ff00004b

## Python
```python
def close_to_zero(t):
    if len(t) == 0: return 0
    t = t.split(" ")
    i = 0
    while True:
        if str(i) in t: return i
        if str(-i) in t: return -i
        i += 1
    return 0
```