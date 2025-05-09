https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763

## Python
```python
def show_sequence(n):
    if n == 0: return "0=0"
    if n<0: return str(n)+"<0"
    s = str(int(n*(n+1)/2))
    w = ""
    for i in range(n+1):
        if n == i: w += str(i) + " = "
        else: w += str(i) + "+"
    return w + s
```