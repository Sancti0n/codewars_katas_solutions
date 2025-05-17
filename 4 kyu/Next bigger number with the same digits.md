https://www.codewars.com/kata/55983863da40caa2c900004e

## Python
```python
def next_bigger(n):
    nb = list(map(int, str(n)))
    if (sorted(nb, reverse=True) == nb): return -1
    n += 1
    v = sorted(list(map(int, str(n))))
    while sorted(nb) != v:
        n += 1
        v = sorted(list(map(int, str(n))))
    return n
```