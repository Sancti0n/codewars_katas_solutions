https://www.codewars.com/kata/558ee8415872565824000007

## Python
```python
def is_divisible(*arr):
    for i in range(1,len(arr)):
        if arr[0]%arr[i] != 0: return False
    return True
```

## JavaScript
```js
function isDivisible(...a){
  for (let i=0;i<a.length;i++) {
    if (a[0]%a[i] != 0) return false
  }
  return true
}
```