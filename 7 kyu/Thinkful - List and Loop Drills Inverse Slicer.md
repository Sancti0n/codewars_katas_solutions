https://www.codewars.com/kata/586ec0b8d098206cce001141

## Python
```python
def inverse_slice(items, a, b):
    return items[:a]+items[b:]
```

## JavaScript
```js
function inverseSlice(items, a, b) {
  return items.slice(0,a).concat(items.slice(b))
}
```