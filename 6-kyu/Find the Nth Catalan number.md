https://www.codewars.com/kata/579637b41ace7f92ae000282

## Python
```py
def nth_catalan_number(n):
    res = 1
    for i in range(n):
        res = res*2*(2*i + 1)//(i+2)
    return res
```