https://www.codewars.com/kata/56ff6a70e1a63ccdfa0001b1

## Python
```python
def array_madness(a,b):
    return sum(list(map(lambda i: i**2, a))) > sum(list(map(lambda i: i**3, b)))
```

## JavaScript
```js
function arrayMadness(a, b) {
  return a.reduce((p, c) => p + c**2, 0) > b.reduce((p, c) => p + c**3, 0)
}
```