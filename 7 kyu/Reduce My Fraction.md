https://www.codewars.com/kata/576400f2f716ca816d001614

## Python
```python
from fractions import Fraction

def reduce_fraction(fraction):
    q = Fraction(fraction[0], fraction[1])
    return (q.numerator, q.denominator)
```

## JavaScript
```js
function reduce(fraction) {
  var gcd = function gcd(a,b){
    return b ? gcd(b, a%b) : a;
  };
  gcd = gcd(...fraction);
  return [fraction[0]/gcd, fraction[1]/gcd];
}
```