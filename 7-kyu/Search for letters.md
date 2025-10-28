https://www.codewars.com/kata/52dbae61ca039685460001ae

## Python
```python
import string

def change(st):
    t = ["0"]*26
    l = list(string.ascii_lowercase)
    for i in st:
        if i.lower() in l:
            t[l.index(i.lower())] = "1"
    return "".join(t)
```

## JavaScript
```js
function change(st) {
  let t = "0".repeat(26).split("");
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  for (let i=0;i<st.length;i++) {
    if (l.indexOf(st[i].toLowerCase())>-1 && t.indexOf(st[i].toLowerCase())<0) {
      t[l.indexOf(st[i].toLowerCase())] = "1";
    }
  }
  return t.join("")
}
```