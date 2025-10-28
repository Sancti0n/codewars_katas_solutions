https://www.codewars.com/kata/58a6568827f9546931000027

## Python
```python
def number_of_carries(a, b):
    l = max(len(str(a)), len(str(b)))
    A = [0]*(l-len(str(a))) + list(map(int, str(a)))
    B = [0]*(l-len(str(b))) + list(map(int, str(b)))
    r = 0
    c = 0
    for i in range(len(A)-1, -1, -1):
        if A[i]+B[i]+r>9:
            c += 1
            r = 1
        else: r = 0
    return c
```