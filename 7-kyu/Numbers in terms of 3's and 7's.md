https://www.codewars.com/kata/62524390983b35002c8ff1e5

## Python
```py
def mul37(num):
    b = num // 7
    while (num - 7 * b) % 3 != 0:
        b -= 1
    a = (num - 7 * b) // 3
    return f"3 * {a} + 7 * {b}"
```