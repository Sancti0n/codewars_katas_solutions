https://www.codewars.com/kata/572b6b2772a38bc1e700007a

## Python
```python
def uni_total(s):
    return sum([ord(i) for i in s])
```

## JavaScript
```js
function uniTotal(s) {
  let v = 0;
  for (let i=0;i<s.length;i++) {
    v += s[i].charCodeAt(0);
  }
  return v
}
```