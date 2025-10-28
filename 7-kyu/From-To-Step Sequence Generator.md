https://www.codewars.com/kata/56459c0df289d97bd7000083

## Python
```python
def generator (_from, _to, _step):
    if _step<=0: return []
    if _from<_to: return [i for i in range(_from, _to+1, _step)]
    if _from>_to: return [i for i in range(_from, _to-1, -_step)]
```