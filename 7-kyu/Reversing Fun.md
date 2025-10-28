https://www.codewars.com/kata/566efcfbf521a3cfd2000056

## Python
```python
def reverse_fun(n):
    n = n[::-1]
    i = 1
    while i<len(n):
        n = n[:i] + n[:i-1:-1]
        i += 1
    return n
```