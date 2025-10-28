https://www.codewars.com/kata/594093784aafb857f0000122

## JavaScript
```js
function diff(a, b) {
  let t = [];
  for (let i=0;i<a.length;i++) {
    if (b.indexOf(a[i])<0 && t.indexOf(a[i])<0) t.push(a[i])
  }
  for (let j=0;j<b.length;j++) {
    if (a.indexOf(b[j])<0 && t.indexOf(b[j])<0) t.push(b[j])
  }
  return t.sort()
}
```

## Python
```python
def diff(a, b):
    t = []
    for i in range(len(a)):
        if a[i] not in b and a[i] not in t: t.append(a[i])
    for i in range(len(b)):
        if b[i] not in a and b[i] not in t: t.append(b[i])
    return sorted(t)
```