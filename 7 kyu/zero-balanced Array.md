https://www.codewars.com/kata/59c6fa6972851e8959000067

## Python
```python
def is_zero_balanced(arr):
    if len(arr)<1 or sum(arr) != 0: return False
    for i in arr:
        if -i not in arr: return False
    return True
```

## JavaScript
```js
function ìsZeroBalanced(n) {
  if (n.length<1 || n.reduce((p, c) => p + c, 0) != 0) return false
  for (let i=0;i<n.length;i++) {
    if (n.indexOf(-n[i])<0) return false
  }
  return true
}
```