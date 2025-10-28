https://www.codewars.com/kata/56453a12fcee9a6c4700009c

## Python
```python
def close_compare(a, b, margin=0):
    return 0 if abs(a-b)<=margin else -1 if a<b else 1
```

## JavaScript
```js
function closeCompare(a, b, margin=0) {
  return Math.abs(a-b)<=margin ? 0: a<b ? -1: 1
}
```