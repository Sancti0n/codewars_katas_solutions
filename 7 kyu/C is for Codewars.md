https://www.codewars.com/kata/675dc1d3830826975c58a09d

## Python
```python
def generate_C(size):
    s = ("C"*5*size + "\n")*size + ("C"*size + "\n")*3*size + ("C"*5*size + "\n")*size
    return s[:-1]
```