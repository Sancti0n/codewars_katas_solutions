https://www.codewars.com/kata/56dc695b2a4504b95000004e

## Python
```python
import string

def caeser(message, key):
    m = message.upper()
    l = list(string.ascii_uppercase)
    s = ""
    for i in range(len(m)):
        if m[i] in l: s += l[(l.index(m[i])+key)%26]
        else: s += m[i]
    return s
```