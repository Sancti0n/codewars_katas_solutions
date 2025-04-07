This series of katas will introduce you to basics of doing geometry with computers.

Vector objects have x, y, and z attributes.

Write a function calculating dot product of Vector a and Vector b.

[You can read more about dot product on Wikipedia.](https://en.wikipedia.org/wiki/Dot_product)

Tests round answers to 6 decimal places.


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