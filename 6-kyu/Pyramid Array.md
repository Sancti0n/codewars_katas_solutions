https://www.codewars.com/kata/515f51d438015969f7000013

## Python
```python
def pyramid(n):
    if n == 0: return []
    t = []
    for i in range(1, n+1):
        t.append([1 for j in range(i)])
    return t
```