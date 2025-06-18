https://www.codewars.com/kata/5f8070c834659f00325b5313

## Python
```python
def andValue(s, d):
    t = s.split(" & ")
    b = d[t[0]]
    for i in range(1,len(t)):
        b = b and d[t[i]]
    return b

def calculate(expr: str, values: dict[str, int]) -> int:
    t, b = [expr.split(" | "), 0]
    for i in t:
        if len(i)>1: b = b or andValue(i, values)
        else: b = b or values[i]
    return b
```