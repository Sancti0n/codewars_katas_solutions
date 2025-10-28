https://www.codewars.com/kata/66939247fc2af275cd8a82d3

## Python
```python
def heron(a,b,c):
    d = (a+b+c)/2
    return (d*(d-a)*(d-b)*(d-c))**.5

def radii(a,b,c):
    return (2*heron(a,b,c)/(a+b+c),a*b*c/(4*heron(a,b,c)))
```