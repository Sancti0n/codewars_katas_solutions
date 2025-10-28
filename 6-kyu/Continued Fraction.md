https://www.codewars.com/kata/660e5631b673a8004b71d208

## Python
```python
def continued_fraction(nu: int, de:int) -> list[int]:
    if nu == 0: return []
    t = []
    i = int(nu/de)
    r1 = nu - de*i
    r2 = de
    t.append(i)
    while r1 != 0:
        i = int(r2/r1)
        m = r1
        r1 = r2 - r1*i
        r2 = m
        t.append(i)
    return t
```

## JavaScript
```js
function continuedFraction(nu, de) {
  if (nu == 0) return []
  let i = parseInt(nu/de);
  let t = [i];
  let r = nu - de*i;
  let m = 0;
  while (r != 0) {
    i = parseInt(de/r);
    m = r;
    r = de - r*i;
    de = m;
    t.push(i);
  }
  return t
}
```