This series of katas will introduce you to basics of doing geometry with computers.

Point objects have x, y attributes. Triangle objects have attributes a, b, c describing their corners, each of them is a Point.

Write a function calculating perimeter of a Triangle defined this way.


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