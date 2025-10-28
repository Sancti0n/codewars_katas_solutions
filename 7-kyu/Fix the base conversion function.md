https://www.codewars.com/kata/57cded7cf5f4ef768800003c

## Python
```python
def convert_num(number, base):
    if type(number) is bool: number = int(number)
    if type(number) is not int: return 'Invalid number input'
    if base not in ["hex", "bin"]: return 'Invalid base input'
    if base == 'hex' and number>=0: return hex(number)
    if base == 'bin' and number>=0: return bin(number)
```