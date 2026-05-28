https://www.codewars.com/kata/5797bbb34be9127074000132

## Python
```py
def tetration(x, y):
    if y == 0: return 1
    else:
        if y == 1: return x
        w = x
        while y>1:
            x = w**x
            y -= 1
        return x
```