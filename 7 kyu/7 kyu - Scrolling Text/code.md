Your task is to complete the function which takes a string, and returns an array with all possible rotations of the given string, in uppercase.

scrollingText("codewars") should return:

```
[ "CODEWARS",
  "ODEWARSC",
  "DEWARSCO",
  "EWARSCOD",
  "WARSCODE",
  "ARSCODEW"
  "RSCODEWA",
  "SCODEWAR" ]
```

## JavaScript
```js
function scrollingText(text) {
  let s = text.toUpperCase();
  let t = [s];
  for (let i=0;i<text.length-1;i++) {
    s = s.substring(1) + s[0];
    t.push(s);
  }
  return t
}
```

## Python
```python
def scrolling_text(text):
    s = text.upper()
    t = [s]
    for i in s:
        s = s[1:] + s[0]
        t.append(s)
    return t[:-1]
```