https://www.codewars.com/kata/5af974846bf32304a2000e98

## Python
```python
def majority(arr):
    if len(arr) == 0: return None
    d = {}
    for i in range(len(arr)):
        if arr[i] in d: d[arr[i]] += 1
        else: d[arr[i]] = 1
    m = [key for m in [max(d.values())] for key, val in d.items() if val == m]
    if len(m)>1: return None
    return m[0]
```