https://www.codewars.com/kata/5514e5b77e6b2f38e0000ca9

## Python
```python
def noInt(n):
    if n>9 or n<0: return False
    return True

def up_array(arr):
    t = filter(noInt,arr)
    if len(arr) == 0 or len(list(t)) != len(arr): return None
    l = list(map(int, str(int(''.join(map(str,arr)))+1)))
    while len(arr)>len(l):
        l.insert(0,0)
    return l
```