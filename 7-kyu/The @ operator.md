https://www.codewars.com/kata/631f0c3a0b9cb0de6ded0529

## Python
```python
def evaluate(equation):
    e = equation.split(" @ ")
    m = int(e[0])
    if m == 0: return 0
    for i in range(1, len(e)):
        if e[i] == "0": return None
        m = 2*m + m*int(e[i]) + m//int(e[i])
    return m
```