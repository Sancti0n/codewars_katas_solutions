https://www.codewars.com/kata/5a5915b8d39ec5aa18000030

## Python
```python
def find_missing(arr1, arr2):
    if len(arr1)>len(arr2):
        max = arr1.copy()
        a = arr2.copy()
    else:
        max = arr2.copy()
        a = arr1.copy()
    for i in max:
        if i not in a or max.count(i) != a.count(i): return i
```

## JavaScript
```js
function findMissing(arr1, arr2) {
  return arr1.reduce((p, c) => p+c, 0) - arr2.reduce((p, c) => p+c, 0)
}
```