https://www.codewars.com/kata/57ced2c1c6fdc22123000316

## JavaScript
```js
function numObj(s) {
  let d = [], obj = {};
  for (let i=0;i<s.length;i++) {
    obj[s[i].toString()] = String.fromCharCode(s[i]);
    d.push(obj);
    obj = {};
  }
  return d
}
```

## Python
```py
def num_obj(s):
    d, obj = [], {}
    for i in s:
        obj[str(i)] = chr(i)
        d.append(obj)
        obj = {}
    return d
```