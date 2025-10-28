https://www.codewars.com/kata/52bc74d4ac05d0945d00054e

## Python
```python
def first_non_repeating_letter(string):
    s = string.lower()
    if s == '': return ''
    for i in range(len(s)):
        if s.count(s[i]) == 1: return string[i]
    return ''
```

## JavaScript
```js
function firstNonRepeatingLetter(s) {
  str = s.toLowerCase();
  if (str == "") return ""
  for (let i=0;i<str.length;i++) {
    if ((str.match(new RegExp(str[i], "g")) || []).length == 1) return s[i]
  }
  return ""
}
```