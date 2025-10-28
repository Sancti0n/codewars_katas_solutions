https://www.codewars.com/kata/5274e122fc75c0943d000148

## Python
```python
def group_by_commas(n):
    n = str(n)
    if len(n)<4: return n
    s = "" + n[:len(n)%3]
    for i in range(len(n)%3, len(n), 3):
        if s == "": s += n[i:i+3]
        else: s += "," + n[i:i+3]
    return s
```

## JavaScript
```js
function groupByCommas(n) {
  n = n.toString();
  if (n.length<4) return n
  let s = "" + n.substring(0, n.length%3)
  for (let i=n.length%3;i<n.length;i += 3) {
    if (s == "") s += n.substring(i, i+3);
    else s += "," + n.substring(i, i+3);
  }
  return s
}
```