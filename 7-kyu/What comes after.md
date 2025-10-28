https://www.codewars.com/kata/590f5b4a7bbb3e246000007d

## JavaScript
```js
function comes_after(str,l) {
  let s = "", c = str.charCodeAt(0);
  for (let i=0;i<str.length-1;i++) {
    c = str[i+1].charCodeAt(0);
    if (str[i].toLowerCase() == l.toLowerCase() && ((c >= 65 && c < 91) || (c >= 97 && c < 123))) s += str[i+1];
  }
  return s
}
```

## Python
```python
def comes_after(st, l):
    s = ""
    for i in range(len(st)-1):
        if st[i].lower() == l.lower() and st[i+1].isalpha(): s += st[i+1]
    return s
```