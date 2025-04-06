Write a function that, given N (positive-only integer) the size of the board , returns the number of different combinations in which these towers can be.

```
For a board of size 3, your function should return 6 because only the following possibilities can be achieved.

| x 0 0 |  | x 0 0 |  | 0 x 0 |
| 0 x 0 |  | 0 0 x |  | x 0 0 |
| 0 0 x |  | 0 x 0 |  | 0 0 x |

| 0 x 0 |  | 0 0 x |  | 0 0 x |
| 0 0 x |  | x 0 0 |  | 0 x 0 |
| x 0 0 |  | 0 x 0 |  | x 0 0 |
```

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