https://www.codewars.com/kata/55a89dd69fdfb0d5ce0000ac

## Python
```python
def types(x):
    return str(type(x)).split(' ')[1].split('>')[0].replace("'",'')
```