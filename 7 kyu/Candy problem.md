https://www.codewars.com/kata/55466644b5d240d1d70000ba

## Python
```python
def candies(lst):
    if len(lst)<2: return -1
    m, s = max(lst), 0
    for i in lst:
        s += m - i
    return s
```

## JavaScript
```js
function candies(l) {
  if (l.length<2) return -1
  let m = Math.max(...l), s = 0;
  for (let i=0;i<l.length;i++) {
    s += m - l[i];
  }
  return s
}
```