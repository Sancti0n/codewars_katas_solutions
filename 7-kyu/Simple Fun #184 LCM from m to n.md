https://www.codewars.com/kata/58bcdc65f6d3b11fce000045

## Python
```python
import math

def mn_lcm(m, n):
    l = min(m, n)
    for i in range(min(m,n), max(m, n)+1):
        l = math.lcm(l, i)
    return l
```

## JavaScript
```js
function gcd(a,b) {
  let c = 0;
  if (Math.min(a, b) == 0) return Math.max(a, b)
  c = Math.max(a, b)%Math.min(a, b);
  return gcd(c, Math.min(a, b))
}

function mnLCM(m,n) {
  let l = Math.min(m,n);
  let Min = Math.min(m, n), Max = Math.max(m, n);
  for (let i=Min;i<=Max;i++) {
    l = (l*i)/gcd(l,i);
  }
  return l
}
```