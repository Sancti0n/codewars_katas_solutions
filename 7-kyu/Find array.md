https://www.codewars.com/kata/59a2a3ba5eb5d4e609000055

## JavaScript
```js
function findArray(arr1, arr2){
  if (arr1.length == 0) return []
  let t = [];
  for (let i=0;i<arr2.length;i++) {
    t.push(arr1[arr2[i]])
  }
  return t
}
```

## Python
```python
def find_array(arr1, arr2):
    if len(arr1) == 0: return []
    t = []
    for i in range(len(arr2)):
        if arr2[i]<len(arr1): t.append(arr1[arr2[i]])
    return t
```