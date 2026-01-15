https://www.codewars.com/kata/6965d769930fb2eff921668f

## Python
```py
def solution(first, second):
    a, b, temp = [first, second, 0]
    while b - a <= a:
        temp = a
        a = b - a
        b = temp
    return (a, b)
```