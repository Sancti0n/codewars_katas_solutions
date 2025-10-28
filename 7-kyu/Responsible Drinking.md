https://www.codewars.com/kata/5aee86c5783bb432cd000018

## JavaScript
```js
function hydrate(s) {
  let v = 0;
  let i = 0;
  s = s.split(" ")
  while (i<s.length) {
    if (!isNaN(s[i])) v += parseInt(s[i]);
    i++;
  }
  return v>1 ? v.toString() + " glasses of water" : v.toString() + " glass of water"
}
```

## Python
```python
def hydrate(s):
    s = s.split(" ")
    v = 0
    for i in s:
        if i.isnumeric(): v += int(i)
    return str(v)+" glasses of water" if v>1 else str(v)+" glass of water"
```