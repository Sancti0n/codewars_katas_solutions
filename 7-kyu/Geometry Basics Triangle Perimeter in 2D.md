https://www.codewars.com/kata/58e3e62f20617b6d7700120a

## JavaScript
```js
function trianglePerimeter(triangle) {
  let A = [triangle.a.x, triangle.a.y];
  let B = [triangle.b.x, triangle.b.y];
  let C = [triangle.c.x, triangle.c.y];
  let AB = ((B[0]-A[0])**2 + (B[1]-A[1])**2)**.5;
  let AC = ((C[0]-A[0])**2 + (C[1]-A[1])**2)**.5;
  let BC = ((C[0]-B[0])**2 + (C[1]-B[1])**2)**.5;
  return AB+BC+AC
}
```

## Python
```python
def triangle_perimeter(triangle):
    A = [triangle.a.x, triangle.a.y]
    B = [triangle.b.x, triangle.b.y]
    C = [triangle.c.x, triangle.c.y]
    AB = ((B[0]-A[0])**2 + (B[1]-A[1])**2)**.5
    AC = ((C[0]-A[0])**2 + (C[1]-A[1])**2)**.5
    BC = ((C[0]-B[0])**2 + (C[1]-B[1])**2)**.5
    return AB+BC+AC
```

## Java
```java
public class GeometryBasics {
  public static double trianglePerimeter(final Geometry.Triangle t) {
    double AB = Math.pow(Math.pow(t.b.x-t.a.x, 2) + Math.pow(t.b.y-t.a.y, 2), .5);
    double AC = Math.pow(Math.pow(t.c.x-t.a.x, 2) + Math.pow(t.c.y-t.a.y, 2), .5);
    double BC = Math.pow(Math.pow(t.c.x-t.b.x, 2) + Math.pow(t.c.y-t.b.y, 2), .5);
    return AB+BC+AC;
  }
}
```