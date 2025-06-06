https://www.codewars.com/kata/582aafca2d44a4a4560000e7

## Python
```python
def keep_order(ary, val):
    if val in ary: return ary.index(val)
    for i in range(len(ary)):
        if ary[i]>=val: return i
    return len(ary)
```

## JavaScript
```js
function keepOrder(ary, val) {
  if (ary.indexOf(val)>-1) return ary.indexOf(val)
  for (let i=0;i<ary.length;i++) {
    if (ary[i]>=val) return i
  }
  return ary.length
}
```