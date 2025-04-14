https://www.codewars.com/kata/5ac5e9aa3853da25d9000102

## Python
```python
def or_arrays(arr1, arr2, d=0):
    t = []
    if len(arr1) != len(arr2):
        m = max(len(arr1), len(arr2))
        arr1 += [d]*(m-len(arr1))
        arr2 += [d]*(m-len(arr2))
    for i in range(len(arr1)):
        t.append(arr1[i] | arr2[i])
    return t
```