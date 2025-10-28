https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e

## JavaScript
```js
function sumOfDifferences(arr) {
  let s = 0;
  arr.sort(function(a, b) { return a - b;});
  arr.reverse();
  for (let i=0;i<arr.length;i++) {
    if (i+1 !== arr.length) s += arr[i]-arr[i+1]
  }
  return s
}
```

## Python
```python
def sum_of_differences(arr):
    return max(arr) - min(arr) if arr else 0
```