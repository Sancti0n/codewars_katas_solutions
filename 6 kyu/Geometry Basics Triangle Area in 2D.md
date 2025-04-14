https://www.codewars.com/kata/58e4377c46e371aee7001262

## JavaScript
```js
function triangleArea(triangle) {
  let AB = ((triangle.b.x-triangle.a.x)**2 + (triangle.b.y-triangle.a.y)**2)**.5;
  let AC = ((triangle.c.x-triangle.a.x)**2 + (triangle.c.y-triangle.a.y)**2)**.5;
  let BC = ((triangle.c.x-triangle.b.x)**2 + (triangle.c.y-triangle.b.y)**2)**.5;
  return (((AB**2 + BC**2 + AC**2)**2 - 2*(AB**4 + BC**4 + AC**4))**.5)/4
}
```

## Python
```python
def triangle_area(triangle):
    AB = ((triangle.b.x-triangle.a.x)**2 + (triangle.b.y-triangle.a.y)**2)**.5
    AC = ((triangle.c.x-triangle.a.x)**2 + (triangle.c.y-triangle.a.y)**2)**.5
    BC = ((triangle.c.x-triangle.b.x)**2 + (triangle.c.y-triangle.b.y)**2)**.5
    return (((AB**2 + BC**2 + AC**2)**2 - 2*(AB**4 + BC**4 + AC**4))**.5)/4
```