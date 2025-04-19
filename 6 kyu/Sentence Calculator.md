https://www.codewars.com/kata/5970fce80ed776b94000008b

## Python
```python
import string

def letters_to_numbers(s):
    minu = list(string.ascii_lowercase)
    m = 0
    for i in range(len(s)):
        if s[i] in minu: m += minu.index(s[i]) + 1
        elif s[i].lower() in minu: m += (minu.index(s[i].lower()) + 1)*2
        elif s[i].isdigit(): m += int(s[i])
    return m
```