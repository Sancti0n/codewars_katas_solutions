https://www.codewars.com/kata/58845748bd5733f1b300001f

## Python
```python
def range_bit_count(a, b):
    return sum(["{0:b}".format(i).count("1") for i in range(a, b+1)])
```