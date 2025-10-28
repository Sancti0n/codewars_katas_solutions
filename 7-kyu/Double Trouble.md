https://www.codewars.com/kata/57f7796697d62fc93d0001b8

## Python
```python
def trouble(x, t):
    l, i = [len(x), 0]
    while i+1<l:
        if x[i] + x[i+1] == t:
            x.pop(i+1)
            l -= 1
            i = 0
        i += 1
    if len(x) == 2 and x[0] + x[1] == t: return [x[0]]
    return x
```