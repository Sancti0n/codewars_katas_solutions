https://www.codewars.com/kata/5661cde807c4e28efa0000d0

## Python
```py
def crazy_formula(n):
    n = list(map(int, str(n)))
    while len(n) > 1:
        if len(n)%2 < 1:
            n = n[:-1]
        m = len(n)//2
        if n[m]%2:
            n[m] = -n[m]
        if n[m]%2 < 1 and n[-1]%2 < 1:
            n[-1] = -n[-1]
        if n[m]%2 < 1 and n[-1]%2:
            n[0] = n[0]**2
        n = list(map(int, str(abs(sum(n)))))
    return n[0]
```