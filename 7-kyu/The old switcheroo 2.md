https://www.codewars.com/kata/55d6a0e4ededb894be000005

## Python
```python
import string

def encode(st):
    l = list(string.ascii_lowercase)
    s = ""
    for i in st:
        if i.lower() in l:
            s += str(l.index(i.lower()) + 1)
        else: s += i
    return s
```

## JavaScript
```js
function encode(str) {
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let s = "";
  for (let i=0;i<str.length;i++) {
    if (l.indexOf(str[i].toLowerCase())>-1) {
      s += (l.indexOf(str[i].toLowerCase()) + 1).toString();
    }
    else s += str[i];
  }
  return s
}
```