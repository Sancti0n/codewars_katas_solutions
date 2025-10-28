https://www.codewars.com/kata/573f5c61e7752709df0005d2

## Python
```python
def merge_arrays(first, second):
    t = list(set(first+second))
    t.sort()
    return t
```

## JavaScript
```js
function mergeArrays(a, b) {
  a = [...new Set(a.concat(b))];
  return a.sort((a,b)=>a-b)
}
```