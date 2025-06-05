https://www.codewars.com/kata/54f9f4d7c41722304e000bbb

## Python
```python
def first_dup(s):
    for i in range(len(s)):
        if s.count(s[i])>1: return s[i]
    return None
```

## JavaScript
```js
function firstDup (s) {
  for (let i=0;i<s.length;i++) {
    if ((s.match(new RegExp(s[i], "g")) || []).length>1) return s[i]
  }
  return undefined
}
```