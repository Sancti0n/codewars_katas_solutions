https://www.codewars.com/kata/60b775debec5c40055657733

## Python
```python
def create_multiplications(n):
    return [lambda x, i=i: i * x for i in range(n)]
```