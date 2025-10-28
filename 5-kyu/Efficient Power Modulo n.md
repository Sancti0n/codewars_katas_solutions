https://www.codewars.com/kata/52fe629e48970ad2bd0007e6

## Python
```python
def power_mod(x, y, p):
    res = 1
    x = x % p
    if (x == 0): return 0
    while (y > 0) :
        if ((y & 1) == 1): res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res
```

## JavaScript
```js
function modpow(x, y, p) {
  let res = 1;
  x = x%p;
  if (x == 0) return 0
  while (y>0) {
    if ((y & 1) == 1) res = (res*x)%p;
    y = y >> 1;
    x = (x*x)%p;
  }
  return res
}
```