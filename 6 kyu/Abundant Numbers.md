https://www.codewars.com/kata/57f3996fa05a235d49000574

## Python
```python
def findDiv(n):
    i = n-1
    s = 0
    while i>1:
        if n%i == 0:
            s += i
        i -= 1
    return s

def nearAbundant(n):
    a = findDiv(n)
    while a<n:
        n -= 1
        a = findDiv(n)
    return [[n], [findDiv(n)-n+1]]

def abundant(h):
    return nearAbundant(h)
```