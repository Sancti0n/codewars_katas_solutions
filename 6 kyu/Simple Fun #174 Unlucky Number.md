https://www.codewars.com/kata/58b65c5e8b98b2e4fa000034

## Python
```python
def unlucky_number(n):
    i = 0
    c = 0
    while i*13<=n:
        if '4' not in str(i*13) and '7' not in str(i*13): c += 1
        i += 1
    return c
```