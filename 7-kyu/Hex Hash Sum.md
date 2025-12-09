https://www.codewars.com/kata/5ab363ff6a176b29880000dd

## Python
```py
def hex_hash(code):
    s = ""
    for i in code:
        s += hex(ord(i))[2:]
    return sum([int(i) for i in s if i.isdigit()])
```