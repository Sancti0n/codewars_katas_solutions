https://www.codewars.com/kata/5ccfcfad7306d900269da53f

## Python
```python
def ldta(n):
    if n == 1 or str(n)[0] == "1" and str(n).count("0") == len(str(n)) - 1: return None
    t = [0,1,2,3,4,5,6,7,8,9]
    i = 1
    while len(t)>1:
        st = str(n**i)
        for j in st:
            if int(j) in t:
                if len(t) == 1: return t[0]
                t.remove(int(j))
        i += 1
    return t[0]
```