https://www.codewars.com/kata/57475353facb0e7431000651

## Python
```python
def hot_singles(arr1, arr2):
    arr = list(dict.fromkeys(arr1)) + list(dict.fromkeys(arr2))
    t = []
    for i in arr:
        if i not in arr1: t.append(i)
        if i not in arr2: t.append(i)
    return t
```

## JavaScript
```js
function hotSingles(arr1, arr2) {
  let arr = [...new Set(arr1.concat(arr2))];
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (arr1.indexOf(arr[i]) < 0) t.push(arr[i]);
    if (arr2.indexOf(arr[i]) < 0) t.push(arr[i]);
  }
  return t
}
```