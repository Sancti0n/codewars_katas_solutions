https://www.codewars.com/kata/5866fc43395d9138a7000006

## Python
```python
def ensure_question(s):
    if s == "": return "?"
    if "?" == s[-1]: return s
    return s+"?"
```

## JavaScript
```js
function ensureQuestion(s) {
  if (s == "") return "?"
  if ("?" == s[s.length-1]) return s
  return s+"?"
}
```