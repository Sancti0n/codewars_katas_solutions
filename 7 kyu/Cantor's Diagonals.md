https://www.codewars.com/kata/5a5e4f5f118dd1b407000028

## Python
```python
def cantor(l):
    d, t = {0:1,1:0}, []
    for i in range(len(l)):
        t.append(d[l[i][i]])
    return t
```