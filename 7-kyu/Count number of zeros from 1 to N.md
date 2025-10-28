https://www.codewars.com/kata/557cffec8c3e8e55cc00010f

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