https://www.codewars.com/kata/585c50e75d0930e6a7000336

## Python
```python
def euclide(a, b):
    if b == 0: return a
    return euclide(b, a%b)

def are_coprime(n,m):
    return euclide(n,m) == 1
```

## JavaScript
```js
function euclide(a, b) {
  if (b === 0) return a
  return euclide(b, a%b)
}

function isCoprime(x, y) {
  return euclide(x,y) === 1
}
```