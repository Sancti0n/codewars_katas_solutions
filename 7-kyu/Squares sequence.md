https://www.codewars.com/kata/5546180ca783b6d2d5000062

## Python
```python
def squares(x, n):
    if n<=0: return []
    t = [x]
    for i in range(n-1):
        t.append(t[i]**2)
    return t
```

## JavaScript
```js
function squares(x, n) {
  if (n<=0) return []
  let t = [x];
  for (let i=0;i<n-1;i++) t.push(t[i]**2);
  return t
}
```