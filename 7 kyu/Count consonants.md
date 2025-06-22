https://www.codewars.com/kata/564e7fc20f0b53eb02000106

## Python
```python
import string

def consonant_count(s):
    a = list(string.ascii_lowercase)
    b = ["a", "e", "i", "o", "u"]
    v = 0
    for i in s.lower():
        if i in a and i not in b: v += 1
    return v
```

## JavaScript
```js
function consonantCount(str) {
  let a = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let b = ["a", "e", "i", "o", "u"];
  let v = 0;
  str = str.toLowerCase();
  for (let i=0;i<str.length;i++) {
    if (a.indexOf(str[i])>-1 && b.indexOf(str[i])<0) v++;
  }
  return v
}
```