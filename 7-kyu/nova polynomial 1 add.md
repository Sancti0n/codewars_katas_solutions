https://www.codewars.com/kata/570ac43a1618ef634000087f

## Python
```python
def poly_add(p1, p2):
    t = []
    for i in range(min(len(p1),len(p2))):
        t.append(p1[i]+p2[i])
    temp = p1[min(len(p1),len(p2)):] + p2[min(len(p1),len(p2)):]
    return t + temp
```