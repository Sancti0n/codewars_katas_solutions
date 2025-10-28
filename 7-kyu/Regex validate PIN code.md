https://www.codewars.com/kata/55f8a9c06c018a0d6e000132

## Python
```python
def validate_pin(pin):
    return pin.isnumeric() and(len(pin)==4 or len(pin)==6)
```