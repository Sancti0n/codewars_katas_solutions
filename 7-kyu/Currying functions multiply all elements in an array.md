https://www.codewars.com/kata/586909e4c66d18dd1800009b

## Python
```python
def multiply_all(arr):
    def line(b=0):
        return [i*b for i in arr]
    return line
```

## JavaScript
```js
function multiplyAll(a, b) {
  if (b === undefined) return b => multiplyAll(a, b)
  return a.map((x) => x * b)
}
```