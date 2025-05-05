https://www.codewars.com/kata/5769a78c6f2dea72b3000027

## Python
```python
def is_bouncy(n):
    return sorted(str(n)) != list(str(n)) and sorted(str(n)) != list(str(n))[::-1]
```