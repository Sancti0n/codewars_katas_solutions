This series of katas will introduce you to basics of doing geometry with computers.

Vector objects (struct in C) have x, y, and z attributes.

Write a function calculating the cross product of Vector a and Vector b, the result should be a Vector object.

[You can read more about cross product on Wikipedia.](https://en.wikipedia.org/wiki/Cross_product)

Tests round answers to 6 decimal places.


## JavaScript
```js
function crossProduct(a, b) {
  let c = a.y*b.z - a.z*b.y;
  let d = a.z*b.x - a.x*b.z;
  let e = a.x*b.y - a.y*b.x;
  return new Vector(c,d,e)
}
```

## Python
```python
def cross_product(a, b):
    c = a.y*b.z - a.z*b.y
    d = a.z*b.x - a.x*b.z
    e = a.x*b.y - a.y*b.x
    return Vector(c,d,e)
```