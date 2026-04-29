https://www.codewars.com/kata/5899642f6e1b25935d000161

## Python
```py
def merge_arrays(arr1, arr2):
    return sorted(set(arr1+arr2))
```

## JavaScript
```js
function mergeArrays(arr1, arr2) {
  a = arr1.concat(arr2)
  a.sort(function(a, b) {
    return a - b
  })
  return [...new Set(a)]
}
```