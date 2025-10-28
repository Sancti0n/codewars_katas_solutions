https://www.codewars.com/kata/596776fbb4f24d0d82000141

## Python
```python
def f(x, a, b, c):
    t = [a,b,c]
    for i in range(len(t)-1):
        if x == t[i]: return t[i+1]
    return a
```

## JavaScript
```js
function f(x, cc) {
  let t = ["a","b","c"];
  for (let i=0;i<2;i++) {
    if (x == cc[t[i]]) return cc[t[i+1]]
  }
  return cc["a"]
}
```