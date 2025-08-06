https://www.codewars.com/kata/583ade15666df5a64e000058

## Python
```python
def evens_and_odds(n):
    if n%2 == 0: return format(n, "b")
    return hex(n).lstrip("0x")
```