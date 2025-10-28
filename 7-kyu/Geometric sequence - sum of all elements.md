https://www.codewars.com/kata/55cb000321ca31039e00007d

## Python
```python
def geometric_sequence_sum(a, r, n):
    return n*a if r == 1 else a*(r**n - 1)/(r-1)
```

## JavaScript
```js
function GeometricSequenceSum(a, r, n) {
  return r == 1 ? n*a: a*(r**n - 1)/(r - 1)
}
```