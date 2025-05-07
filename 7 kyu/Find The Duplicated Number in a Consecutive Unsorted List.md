https://www.codewars.com/kata/558dd9a1b3f79dc88e000001

## Python
```python
def find_dup(arr):
    v = list(set(arr))
    for i in v:
        if arr.count(i)>1: return i
```

## JavaScript
```js
function findDup(arr) {
  let v = [...new Set(arr)];
  for (let i=0;i<v.length;i++) {
    if (arr.filter(e => e === v[i]).length>1) return v[i]
  }
}
```