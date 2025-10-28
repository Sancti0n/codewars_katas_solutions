https://www.codewars.com/kata/52efefcbcdf57161d4000091

## Python
```python
def count(s):
    d = {}
    for i in range(len(s)):
        if s[i] in d: d[s[i]] += 1
        else: d[s[i]] = 1
    return d
```

## JavaScript
```js
function count (s) {
  let d = {};
  for (let i=0;i<s.length;i++) {
    if (d[s[i]]>0) d[s[i]] += 1;
    else d[s[i]] = 1;
  }
  return d
}
```