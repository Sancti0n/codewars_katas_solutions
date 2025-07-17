https://www.codewars.com/kata/58635f1b2489549be50003f1

## Python
```python
import math

def quadratic_formula(a, b, c):
    root1 = (-b+math.sqrt(b**2 - 4*a*c))/(2*a)
    root2 = (-b-math.sqrt(b**2 - 4*a*c))/(2*a)
    return [root1, root2]
```

## JavaScript
```js
function quadraticFormula(a, b, c) {
  return [(-b+Math.sqrt(b**2 - 4*a*c))/(2*a), (-b-Math.sqrt(b**2 - 4*a*c))/(2*a)]
}
```