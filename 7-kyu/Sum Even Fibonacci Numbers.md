https://www.codewars.com/kata/5926624c9b424d10390000bf

## Python
```py
def sum_even_fibonacci(limit):
    a, b, s = [1, 2, 0]
    while a<=limit:
        if a%2<1: s += a
        a, b = [b, a + b]
    return s
```