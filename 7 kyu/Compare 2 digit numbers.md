https://www.codewars.com/kata/63f3c61dd27f3c07cc7978de

## Python
```python
def compare(a, b):
    c = 0
    w = ""
    if a == b: return "100%"
    for i in range(len(str(a))):
        if str(a)[i] in str(b) and str(a)[i] not in w:
            c += 1
            w += str(a)[i]
    return str(int(100*c/len(str(a))))+"%"
```