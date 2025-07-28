https://www.codewars.com/kata/515decfd9dcfc23bb6000006

## Python
```python
def is_valid_IP(strng):
    if strng.count('.') != 3: return False
    x = strng.split('.')
    for i in x:
        if not i.isnumeric() or int(i)>255 or (i[0] == '0' and len(i)>1): return False
    return True
```