https://www.codewars.com/kata/54466996990c921f90000d61

## JavaScript
```js
var isMonotone = function(arr) {
  for (let i=1;i<=arr.length;i++) {
    if (arr[i]<arr[i-1]) return false
  }
  return true
}
```

## Python
```python
def is_monotone(heights):
    for i in range(1, len(heights)):
        if heights[i]<heights[i-1]: return False
    return True
```