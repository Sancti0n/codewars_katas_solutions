Create an algorithm to count the number of zeros that appear between 1 and N.


## Python
```python
def count_zeros(n):
    result, i = [0, 1]
    while True:
        b, c = divmod(n, i)
        a, b = divmod(b, 10)
        if a == 0: return result
        if b == 0: result += (a - 1) * i + c + 1
        else: result += a * i
        i *= 10
```