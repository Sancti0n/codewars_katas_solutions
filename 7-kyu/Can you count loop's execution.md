https://www.codewars.com/kata/633bbba75882f6004f9dae4c

## Python
```python
def count_loop_iterations(arr):
    t = []
    product = 1
    for [n, b] in arr:
        c = n + 1 + b
        t.append(c*product)
        product *= c-1
    return t
```