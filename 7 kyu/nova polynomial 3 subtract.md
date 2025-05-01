https://www.codewars.com/kata/5714041e8807940ff3001140

## Python
```python
def poly_subtract(p1, p2):
    t = []
    for i in range(min(len(p1),len(p2))):
        t.append(p1[i]-p2[i])
    temp = p1[min(len(p1),len(p2)):] + [-p2[j] for j in range(min(len(p1),len(p2)), len(p2))]
    return t + temp
```