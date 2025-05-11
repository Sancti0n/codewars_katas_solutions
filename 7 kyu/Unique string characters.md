https://www.codewars.com/kata/5a262cfb8f27f217f700000b

## Python
```python
def solve(a,b):
    s = ""
    for i in a:
        if i not in b: s += i
    for j in b:
        if j not in a: s += j
    return s
```

## JavaScript
```js
function solve(a,b) {
  let s = "";
  for (let i=0;i<a.length;i++) {
    if (b.indexOf(a[i])<0) s += a[i];
  }
  for (let j=0;j<b.length;j++) {
    if (a.indexOf(b[j])<0) s += b[j];
  }
  return s
}
```