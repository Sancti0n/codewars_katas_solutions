https://www.codewars.com/kata/592e830e043b99888600002d

## Python
```python
import string
def encode(message, key):
    minu = list(string.ascii_lowercase)
    s = str(key)
    t = []
    for i in range(len(message)):
        t.append(minu.index(message[i])+int(s[i%len(s)])+1)
    return t
```

## JavaScript
```js
function encode(str, n) {
  let m = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let s = n.toString();
  let t = [];
  for (let i=0;i<str.length;i++) {
    t.push(m.indexOf(str[i])+parseInt(s[i%s.length])+1);
  }
  return t
}
```