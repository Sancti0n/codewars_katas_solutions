https://www.codewars.com/kata/5f8341f6d030dc002a69d7e4

## Python
```python
def least_larger(a, i):
    if i<0 or max(a) == a[i]: return -1
    v = a[i]+1
    while v not in a: v += 1
    return a.index(v)
```

## JavaScript
```js
function leastLarger(a,i) {
  if (i<0 || Math.max(...a) == a[i]) return -1
  let v = a[i]+1;
  while (a.indexOf(v) === -1) v++;
  return a.indexOf(v)
}
```