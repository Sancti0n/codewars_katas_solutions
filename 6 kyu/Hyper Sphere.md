https://www.codewars.com/kata/52de9bd621c71b919c000592

## Python
```python
def in_sphere(coords, radius):
    s = 0
    for i in coords:
        s += i**2
    return s <= radius**2
```