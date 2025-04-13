Your function is given four arguments (kanga1, rate1, kanga2, rate2); the first kangaroo's starting point, the first kangaroo's speed, the second kangaroo's starting point, and the second kangaroo's speed.

Return true if the above conditions are met, else false. Starting location and speed may vary wildly. The first kangaroo will usually start behind the second one and travel faster, but not always. Starting locations may be negative, but speeds will always be > 0.

## Python
```python
def kangaroo(kanga1, rate1, kanga2, rate2):
    if rate1-rate2 == 0: return False
    c = (kanga2-kanga1)/(rate1-rate2)
    return True if c.is_integer() and c>=0 else False
```

## JavaScript
```js
function kangaroo(kanga1, rate1, kanga2, rate2) {
  if (rate1-rate2 == 0) return false
  let c = (kanga2-kanga1)/(rate1-rate2);
  return parseInt(c) == c && c>=0 ? true : false
}
```