https://www.codewars.com/kata/5d41e16d8bad42002208fe1a

## Python
```python
def more_zeros(s):
    t = []
    for i in range(len(s)):
        v = format(ord(s[i]), '08b')
        if s[i] != '0':
            while v[0] == '0': v = v[1:len(v)]
        if v.count('0')>v.count('1') and s[i] not in t: t.append(s[i])
    return t
```