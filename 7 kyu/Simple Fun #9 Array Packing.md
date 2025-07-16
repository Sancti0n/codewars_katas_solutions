https://www.codewars.com/kata/588453ea56daa4af920000ca

## Python
```python
def array_packing(arr):
    w = ""
    for i in range(len(arr)-1, -1, -1):
        w += format(arr[i], '08b')
    return int(w, 2)
```