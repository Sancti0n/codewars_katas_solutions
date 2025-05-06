https://www.codewars.com/kata/5274e122fc75c0943d000148

## Python
```python
def group_by_commas(n):
    n = str(n)
    if len(n)<4: return n
    s = "" + n[:len(n)%3]
    for i in range(len(n)%3, len(n), 3):
        if s == "": s += n[i:i+3]
        else: s += "," + n[i:i+3]
    return s
```