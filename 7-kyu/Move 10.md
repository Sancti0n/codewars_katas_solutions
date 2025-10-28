https://www.codewars.com/kata/57cf50a7eca2603de0000090

## Python
```python
import string

def move_ten(s):
    l = list(string.ascii_lowercase)
    w = ""
    for i in s:
        w += l[(l.index(i)+10)%26]
    return w
```

## JavaScript
```js
function moveTen(s) {
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let w = "";
  for (let i=0;i<s.length;i++) {
    w += l[(l.indexOf(s[i])+10)%26];
  }
  return w
}
```