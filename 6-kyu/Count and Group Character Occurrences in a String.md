https://www.codewars.com/kata/543e8390386034b63b001f31

## Python
```python
import re

def get_char_count(s):
    s = s.lower()
    t = list(set(s))
    d = {}
    for i in t:
        if re.search("[a-zA-Z0-9]", i):
            if s.count(i) in d:
                d[s.count(i)].append(i)
                d[s.count(i)].sort()
            else: d[s.count(i)] = [i]
    d = dict(sorted(d.items(), reverse=True))
    return d
```