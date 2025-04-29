https://www.codewars.com/kata/574b1916a3ebd6e4fa0012e7

## Python
```python
def is_opposite(s1,s2):
    if len(s1) < 1 or len(s2) < 1: return False
    for i in range(len(s1)):
        if s1[i] == s2[i]: return False
    return True
```

## JavaScript
```js
function isOpposite(s1,s2) {
  if (s1.length<1 || s2.length<1 || s1.length != s2.length) return false
  for (let i=0;i<s1.length;i++) {
    if (s1[i] == s2[i]) return false
  }
  return true
}
```