https://www.codewars.com/kata/59cfc09a86a6fdf6df0000f1

## JavaScript
```js
function capitalize(s,arr){
  s = s.split("")
  for (let i=0;i<s.length;i++) {
    if (arr.indexOf(i)>-1) s[i] = s[i].toUpperCase();
  }
  return s.join("")
};
```

## Python
```python
def capitalize(s, arr):
    s = list(s)
    for i in range(len(s)):
        if arr.count(i)>0: s[i] = s[i].upper()
    return "".join(s)
```