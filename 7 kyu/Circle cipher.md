https://www.codewars.com/kata/634d0723075de3f97a9eb604

## Python
```python
import math

def encode(s:str) -> str:
    if s == "": return ""
    st = s[0] + s[len(s)-1]
    for i in range(1, math.ceil(len(s)/2)):
        st += s[i] + s[len(s)-1-i]
    return st if len(s)%2 == 0 else st[:-1]
    
def decode(s:str) -> str:
    t1 = []
    t2 = []
    for i in range(len(s)):
        if i%2: t1.append(s[i])
        else: t2.append(s[i])
    return "".join(t2+t1[::-1])
```