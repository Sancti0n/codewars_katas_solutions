https://www.codewars.com/kata/58bccdf56f25ff6b6d00002f

## JavaScript
```js
function rounding(n, m) {
  let lower = n - (n % m);
  let upper = lower + m;
  if (2*n - lower == upper) return n
  return n - lower < upper - n ? lower : upper
}
```

## Python
```python
def rounding(n,m):
    lower = n - (n % m)
    upper = lower + m
    if 2*n - lower == upper: return n
    return lower if n - lower < upper - n else upper
```