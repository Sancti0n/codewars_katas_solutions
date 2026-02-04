https://www.codewars.com/kata/59a151c53f64cdd94c00008f

## JavaScript
```js
function isInertial(arr) {
  arr.sort((a, b) => b - a)
  if (Math.abs(arr[0]) % 2 || Math.abs(arr[1]) % 2 < 1 || arr.length < 2) return false
  for (let i=1;i<=arr.length;i++) {
    if (Math.abs(arr[i]) % 2 < 1 && Math.abs(arr[i + 1]) % 2) return false
  }
  return true
}
```

## Python
```py
def is_inertial(arr):
    if len(arr)<1: return False
    arr.sort(reverse=True)
    if abs(arr[0])%2 or abs(arr[1])%2<1 or len(arr)<2:
        return False
    for i in range(1, len(arr)-1):
        if abs(arr[i])%2<1 and abs(arr[i+1])%2:
            return False
    return True
```