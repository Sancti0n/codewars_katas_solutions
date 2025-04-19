https://www.codewars.com/kata/5263a84ffcadb968b6000513

## Python
```python
def matrix_mult(a: list[list[int]], b: list[list[int]]) -> list[list[int]]:
    res = [[0 for x in range(len(a))] for y in range(len(a))]
    for i in range(len(a)):
        for j in range(len(b[0])):
            for k in range(len(b)):
                res[i][j] += a[i][k] * b[k][j]
    return res
```