https://www.codewars.com/kata/59971206e06bbf4407002382

## Python
```py
import math

def sum_and_multiply(somme, multiply):
    d = somme**2 - 4*multiply
    if d >= 0 and math.sqrt(d).is_integer():
        return [int((somme-math.sqrt(d))/2),int((somme+math.sqrt(d))/2)]
    else: return None
```

## JavaScript
```js
var sumAndMultiply = function(sum, multiply) {
  let d = sum**2 - 4*multiply;
  if (d>=0 && d**.5 == Math.floor(d**.5)) {
    return [Math.floor((sum-d**.5)/2), Math.floor((sum+d**.5)/2)]
  }
  else {
    return null
  }
}
```