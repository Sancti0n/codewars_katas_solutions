https://www.codewars.com/kata/5421c6a2dda52688f6000af8

## Python
```python
def compose(f,g):
    def a(*x):
        t = list(x)
        return f(g(sum(t)))
    return a
```