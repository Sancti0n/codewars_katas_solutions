https://www.codewars.com/kata/5870ef72aa04283934000043

## Python
```py
def russian_peasant_multiplication(x, y):
    p = 0
    while y != 0:
        if y%2 == 1:
            p = p + x
        x = x + x
        y = int(y/2)
    return p
```