https://www.codewars.com/kata/5832db03d5bafb7d96000107

## JavaScript
```js
function lottery(str) {
  let s = "";
  for (let i=0;i<str.length;i++) {
    if (!isNaN(str[i]) && s.indexOf(str[i]) < 0) s += str[i];
  }
  return s.length ? s: "One more run!"
}
```

## Python
```python
def lottery(s):
    st = ""
    for i in s:
        if i.isdigit() and i not in st: st += i
    return st if len(st) else "One more run!"
```