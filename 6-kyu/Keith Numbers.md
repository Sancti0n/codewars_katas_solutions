https://www.codewars.com/kata/590e4940defcf1751c000009

## Python
```py
def is_keith_number(n):
    if n<10: return False
    t = list(map(int, str(n)))
    c = 1
    while sum(t) < n:
        t = t[1:] + [sum(t)]
        c += 1
    return c if sum(t) == n else False
```