https://www.codewars.com/kata/58311faba317216aad000168

## Python
```python
def print_nums(*args):
    if len(args) < 1: return ''
    s = ""
    for i in args:
        s += "0"*(len(str(max(args)))-len(str(i))) + str(i) + "\n"
    return s[:-1]
```