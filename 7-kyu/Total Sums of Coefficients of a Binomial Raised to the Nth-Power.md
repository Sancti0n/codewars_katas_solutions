https://www.codewars.com/kata/584a6d9d7d22f8fa09000094

## Python
```python
def f(n):
    if n == 0: return [1, 1]
    t = [1]
    for i in range(1, n+1): t.append(t[i-1]*2)
    t.append(sum(t))
    return t
```