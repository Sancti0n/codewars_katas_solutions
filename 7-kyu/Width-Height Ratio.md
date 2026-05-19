https://www.codewars.com/kata/55486cb94c9d3251560000ff

## JavaScript
```js
function calculateRatio(w, h) {
  if (h == 0 || w == 0) throw new Error();
  let gcd = function gcd(a,b){
    return b ? gcd(b, a%b) : a;
  };
  gcd = gcd(w, h);
  return (w/gcd).toString() + ":" + (h/gcd).toString();
}
```

## Python
```py
from fractions import Fraction

def calculate_ratio(w, h):
    if w == 0 or h == 0: raise NameError()
    q = Fraction(w, h)
    return str(q.numerator) + ":" + str(q.denominator)
```