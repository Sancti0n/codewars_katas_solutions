https://www.codewars.com/kata/515ceaebcc1dde8870000001

## Python
```python
def solution(items, index, default_value):
    return items[index] if abs(index) <= len(items) else default_value
```