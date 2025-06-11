https://www.codewars.com/kata/570f6436b29c708a32000826

## Python
```python
def first_non_repeated(s):
    for i in s:
        if s.count(i) == 1: return i
```

## JavaScript
```js
function firstNonRepeated(s) {
  for (let i=0;i<s.length;i++) {
    if ((s.match(new RegExp(s[i], "g")) || []).length == 1) return s[i]
  }
  return null
}
```