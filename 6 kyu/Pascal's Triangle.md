https://www.codewars.com/kata/5226eb40316b56c8d500030f

## Python
```python
def factorial(n):
    if n == 0: return 1
    else: return n * factorial(n-1)

def binome(n, p):
    return int(factorial(n)//(factorial(p)*factorial(n-p)))

def pascals_triangle(p):
    t = []
    i = 0
    while i<p: 
        for a in range(0,i+1):
            t.append(binome(i,a))
        i += 1
    return t
```