https://www.codewars.com/kata/5a2b7edcb6486a856e00005b

## JavaScript
```js
function checkVowel(string, position) {
  if (position<0) return false
  let t = ["a","e","i","o","u"];
  return t.indexOf(string.toLowerCase()[position])>-1
};
```

## Python
```python
def check_vowel(s,p):
    if p<0 or p>len(s): return False
    t = ["a","e","i","o","u"]
    s = s.lower()
    return s[p] in t
```