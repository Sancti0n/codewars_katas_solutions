https://www.codewars.com/kata/5932c94f6aa4d1d786000028

## Python
```python
def perfect_roots(n):
    return n**.5 == int(n**.5) and n**.25 == int(n**.25) and n**.125 == int(n**.125)
```

## JavaScript
```js
function perfectRoots(n) {
  return n**.125 %1 == 0
}
```