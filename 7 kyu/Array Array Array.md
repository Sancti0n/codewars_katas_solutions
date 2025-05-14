https://www.codewars.com/kata/57eb936de1051801d500008a

## Python
```python
def explode(arr):
    a, b = [arr[0], arr[1]]
    if type(a) == int and type(b) == int: return [arr]*(a+b)
    if type(a) == int: return [arr]*a
    if type(b) == int: return [arr]*b
    return 'Void!'
```