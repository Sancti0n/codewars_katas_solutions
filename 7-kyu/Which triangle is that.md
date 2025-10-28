https://www.codewars.com/kata/564d398e2ecf66cec00000a9

## JavaScript
```js
var typeOfTriangle = function (sideA, sideB, sideC) {
  if (isNaN(sideA) || isNaN(sideB) || isNaN(sideC) || 2*Math.max(sideA, sideB, sideC) >= sideA + sideB + sideC) return "Not a valid triangle"
  if (sideA == sideB && sideA == sideC) return "Equilateral"
  if (sideA == sideB || sideA == sideC || sideB == sideC) return "Isosceles"
  return "Scalene"
}
```

## Python
```python
def type_of_triangle(a, b, c):
    if type(a) is not int or type(b) is not int or type(c) is not int or 2*max(a,b,c) >= sum([a,b,c]): return "Not a valid triangle"
    if a == b and a == c: return "Equilateral"
    if a == b or a == c or b == c: return "Isosceles"
    return "Scalene"
```