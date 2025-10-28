https://www.codewars.com/kata/57ae18c6e298a7a6d5000c7a

## Python
```python
def replace_all(obj, find, replace):
    x = [replace if obj[i] == find else obj[i] for i in range(len(obj))]
    if type(obj) is list: return x
    return ''.join(x)
```