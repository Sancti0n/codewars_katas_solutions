https://www.codewars.com/kata/538835ae443aae6e03000547

## Python
```python
def add(n):
    def f(m):
        return n+m
    return f
```

## JavaScript
```js
function add(n) {
  return function(m) {
    return n+m
  }
}
```