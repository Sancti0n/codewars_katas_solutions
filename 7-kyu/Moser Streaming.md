https://www.codewars.com/kata/6a19ce85283166ed5c3dda8c

## Python
```py
def moser():
    n = 1
    while True:
        valeur = (n**4 - 6*n**3 + 23*n**2 - 18*n + 24) // 24
        yield valeur
        n += 1
```