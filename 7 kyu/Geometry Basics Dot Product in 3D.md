https://www.codewars.com/kata/58e3ea29a33b52c1dc0000c0

## JavaScript
```js
function dotProduct(v1, v2) {
   return (v1.x*v2.x)+(v1.y*v2.y)+(v1.z*v2.z)
}
```

## Python
```python
def dot_product(a, b):
    A = [a.x, a.y, a.z]
    B = [b.x, b.y, b.z]
    s = A[0]*B[0] + A[1]*B[1] + A[2]*B[2]
    return s
```

## Java
```java
public class GeometryBasics {
  public static double dotProduct(final Vector3D a, final Vector3D b) {
    return a.x*b.x + a.y*b.y + a.z*b.z;
  }
}
```