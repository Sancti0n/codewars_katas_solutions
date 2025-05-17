https://www.codewars.com/kata/59cdb2b3a25c8c6d56000005

## Python
```python
def find_unknown_number(x,y,z):
    if x == y == z == 0: return 105
    for i in range(1, 3*5*7):
        if i%3 == x and i%5 == y and i%7 == z: return i
```

## JavaScript
```js
function findUnknowNumber(x,y,z) {
  if (x == 0 && y == 0 && z == 0) return 105
  for (let i=0;i<106;i++) {
    if (i%3 == x && i%5 == y && i%7 == z) return i
  }
}
```