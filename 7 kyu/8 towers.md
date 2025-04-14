https://www.codewars.com/kata/535bea76cdbf50281a00004c

## JavaScript
```js
function facto(n) {
  if (n==1n) return 1n
  return n*facto(n-1n)
}

function towerCombination(n) {
  return facto(BigInt(n));
}
```

## Python
```python
def facto(n):
    if n==1: return n
    return n*facto(n-1)

def tower_combination(n):
    return facto(n)
```