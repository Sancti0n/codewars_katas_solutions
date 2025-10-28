https://www.codewars.com/kata/5902f1839b8e720287000028

## Python
```python
import math

def gcd(a, b):
    if b == 0: return a
    return gcd(b,a%b)

def parameter(n):
    a = sum(list(map(int, str(n))))
    b = math.prod(list(map(int, str(n))))
    return (a*b)/(gcd(a,b))
```

## JavaScript
```js
function gcd(a,b) {
  if (b==0) return a
  return gcd(b,a%b)
}

function parameter(n) {
  let a = Array.from(String(n), Number).reduce((a, b)=> a+b, 0);
  let b = Array.from(String(n), Number).reduce((a, b)=> a*b, 1);
  return (a*b)/gcd(a,b)
}
```