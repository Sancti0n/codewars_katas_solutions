https://www.codewars.com/kata/5a40fc7ce1ce0e34440000a3

## Python
```python
def is_dd(n):
    i = 1
    while i<10:
        if i == str(n).count(str(i)): return True
        i += 1
    return False
```

## JavaScript
```js
function isDd(n) {
  let i = 1;
  while (i<10) {
    if (i == (n.toString().match(new RegExp(i.toString(), "g")) || []).length) return true
    i++;
  }
  return false
}
```