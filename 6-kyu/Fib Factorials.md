https://www.codewars.com/kata/589926bf7a2a3992050014f1

## Python
```py
def facto(n):
    if n<2: return 1
    i, s = 2, 1
    while i<=n:
        s *= i
        i += 1
    return s

def sum_fib(n):
    a, b = 0, 1
    t = []
    for i in range(n):
        t.append(facto(a))
        a, b = [b, a+b]
    return sum(t)
```