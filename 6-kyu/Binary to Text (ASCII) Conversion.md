https://www.codewars.com/kata/5583d268479559400d000064

## Python
```python
def binary_to_string(binary):
    s, i = ["", 0]
    while i<len(binary):
        s += chr(int(binary[i:i+8], 2))
        i += 8
    return s
```