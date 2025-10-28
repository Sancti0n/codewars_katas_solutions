https://www.codewars.com/kata/559e10e2e162b69f750000b4

## Python
```python
def dominator(arr):
    if len(arr)<1: return -1
    t = list(set(arr))
    m = []
    for i in range(len(t)):
        m.append(arr.count(t[i]))
    if m.count(max(m)) == 1 and max(m)>len(arr)/2: return t[m.index(max(m))]
    return -1
```

## JavaScript
```js
function dominator(arr) {
  let t = [...new Set(arr)]
  for (let i=0;i<t.length;i++) {
    if (arr.filter(e => e === t[i]).length>arr.length/2) return t[i]
  }
  return -1
}
```