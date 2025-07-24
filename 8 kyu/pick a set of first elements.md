https://www.codewars.com/kata/572b77262bedd351e9000076

## Python
```python
def first(seq, n=-1):
    if n == -1: return seq[:1]
    return seq[:n]
```

## JavaScript
```js
function first(arr, n=1) {
  return arr.slice(0,n)
}
```