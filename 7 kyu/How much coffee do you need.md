https://www.codewars.com/kata/57de78848a8b8df8f10005b1

## Python
```python
def how_much_coffee(events):
    s = 0
    t = ['cw', 'dog', 'cat', 'movie']
    st = 'You need extra sleep'
    for i in events:
        if s>3: return st
        elif i.islower() and i in t: s += 1
        elif i.isupper() and i.lower() in t: s += 2
    return st if s>3 else s
```