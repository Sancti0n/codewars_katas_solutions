https://www.codewars.com/kata/5c942f40bc4575001a3ea7ec

## Python
```python
def per(n):
    if n<10: return []
    n = str(n)
    t = []
    while int(n)>9:
        s = 1
        for i in range(len(n)):
            s *= int(n[i])
        t.append(s)
        n = str(s)
    return t
```

## JavaScript
```js
function per(n) {
  if (n<10) return []
  n = n.toString();
  let t = [];
  while (parseInt(n)>9) {
    let s = 1;
    for (let i=0;i<n.length;i++) {
      s *= parseInt(n[i]);
    }
    t.push(s);
    n = s.toString();
  }
  return t
}
```