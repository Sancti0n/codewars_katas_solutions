https://www.codewars.com/kata/5ae7e1522c5061beb7000051

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