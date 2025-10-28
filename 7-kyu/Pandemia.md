https://www.codewars.com/kata/5e2596a9ad937f002e510435

## Python
```python
def infected(s):
    s = s.split("X")
    t, m = 0, 0
    for i in s:
        t += len(i)
        if "1" in i: m += len(i)
    if t == 0: return 0
    return 100*m/t
```

## JavaScript
```js
function infected(s) {
  s = s.split("X");
  let t = 0, m = 0;
  for (let i=0;i<s.length;i++) {
    t += s[i].length;
    if (s[i].indexOf("1")>-1) m += s[i].length;
  }
  if (t == 0) return 0
  return 100*m/t
}
```