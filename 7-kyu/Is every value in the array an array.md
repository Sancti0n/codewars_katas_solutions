https://www.codewars.com/kata/582c81d982a0a65424000201

## Python
```python
def arr_check(arr):
    if len(arr)<1 and type(arr) is list: return True
    for i in arr:
        if type(i) is not list: return False
    return True
```

## JavaScript
```js
const arrCheck = value => {
  if (value.length<1 && Array.isArray(value)) return true
  for (let i=0;i<value.length;i++) {
    if (!Array.isArray(value[i])) return false
  }
  return true
}
```