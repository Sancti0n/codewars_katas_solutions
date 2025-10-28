https://www.codewars.com/kata/58e440d8acfd3edfb2000aee

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