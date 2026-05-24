https://www.codewars.com/kata/68c7c3cb12252d313dc9fd8b

## Python
```py
def is_palindrome(n: int) -> bool:
    binary_str = bin(n)[2:]
    return binary_str == binary_str[::-1]
```