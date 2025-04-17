https://www.codewars.com/kata/559576d984d6962f8c00003c

## Python
```python
def arr2bin(arr):
    v = 0
    for i in arr:
        if type(i) is not int: return False
        else: v += i
    return "{0:b}".format(v)
```

## JavaScript
```js
function arr2bin(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    if (!Number.isInteger(arr[i])) return false
    s += arr[i];
  }
  return s.toString(2)
}
```