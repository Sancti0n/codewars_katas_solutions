https://www.codewars.com/kata/64bd5ff1bb8f1006708e545e

## Python
```py
def secret_number(n):
    a = bin(n).count("0")
    b = bin(n).count("1")
    return a**2 if n%2<1 else b**2
```