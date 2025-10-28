https://www.codewars.com/kata/561046a9f629a8aac000001d

## Python
```python
def match_arrays(v, r):
    c = 0
    for i in v:
        if i in r: c += 1
    return c
```

## JavaScript
```js
function matchArrays(v,r) {
  let c = 0;
  for (let i=0;i<v.length;i++) {
    if (r.indexOf(v[i])>-1) c++;
  }
  return c
}
```