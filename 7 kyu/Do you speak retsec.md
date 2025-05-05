https://www.codewars.com/kata/5516ab668915478845000780

## Python
```python
def reverse_by_center(s):
    if len(s)%2 == 0: return s[int(len(s)/2):]+s[:int(len(s)/2)]
    return s[int(len(s)/2)+1:]+s[int(len(s)/2)]+s[:int(len(s)/2)]
```