https://www.codewars.com/kata/55208f16ecb433c5c90001d2

## Python
```python
def trace(matrix):
    if len(matrix)<1: return None
    for j in range(len(matrix)):
        if len(matrix) != len(matrix[j]): return None
    s = 0
    for i in range(len(matrix)):
        if matrix[i] != []: s += matrix[i][i]
    return s
```