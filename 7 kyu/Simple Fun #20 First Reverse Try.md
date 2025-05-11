https://www.codewars.com/kata/5886c6b2f3b6ae33dd0000be

## Python
```python
def first_reverse_try(arr):
    if arr == [] or len(arr) == 1: return arr
    return [arr[len(arr)-1]]+arr[1:len(arr)-1]+[arr[0]]
```

## JavaScript
```js
function firstReverseTry(arr) {
  if (arr.length < 2) return arr
  let m = arr[0];
  arr[0] = arr[arr.length-1];
  arr[arr.length-1] = m;
  return arr
}
```