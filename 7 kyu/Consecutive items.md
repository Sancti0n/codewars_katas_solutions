https://www.codewars.com/kata/5f6d533e1475f30001e47514

## Python
```python
def consecutive(arr, a, b):
    return abs(arr.index(a)-arr.index(b)) == 1
```

## JavaScript
```js
function consecutive(arr, a, b) {
  return Math.abs(arr.indexOf(a)-arr.indexOf(b)) == 1
}
```