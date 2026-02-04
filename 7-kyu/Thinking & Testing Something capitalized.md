https://www.codewars.com/kata/56d93f249c844788bc000002

## Python
```python
def testit(s):
    return s[::-1].title()[::-1]
```

## JavaScript
```js
function testit(s) {
  if (!s) return s
  s = s.split(" ");
  for (let i=0;i<s.length;i++) {
    s[i] = s[i].slice(0, -1) + s[i].slice(-1).toUpperCase();
  }
  return s.join(" ")
}
```