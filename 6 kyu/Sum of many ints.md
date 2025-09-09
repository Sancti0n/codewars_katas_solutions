https://www.codewars.com/kata/54c2fc0552791928c9000517

## Python
```py
def f(n, m):
    if n>=m:
        s = 0
        while n>=m:
            s += m*(m-1)/2
            n -= m
        return s + n*(n+1)/2
    return n*(n+1)/2
```