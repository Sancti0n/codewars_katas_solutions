https://www.codewars.com/kata/56853c44b295170b73000007

## Python
```python
import math

def is_square(arr):
    if len(arr) == 0: return None
    for i in arr:
        if int(math.sqrt(i))**2 != i: return False
    return True
```

## JavaScript
```js
var isSquare = function(arr){
  if (arr.length == 0) return undefined
  for (let i=0;i<arr.length;i++) {
    if (Math.floor(Math.sqrt(arr[i]))**2 != arr[i]) return false
  }
  return true
}
```