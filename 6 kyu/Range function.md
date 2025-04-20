https://www.codewars.com/kata/584ebd7a044a1520f20000d5

## Python
```python
def range_function(*t):
    t = list(t)
    if len(t) == 1: return range(1, t[0]+1)
    elif len(t) == 2: return range(t[0], t[1]+1)
    return range(t[0], t[2]+1, t[1])
```