This series of katas will introduce you to basics of doing geometry with computers.

Point objects have x, y, and z attributes. For Haskell there are Point data types described with record syntax with fields x, y, and z.

Write a function calculating distance between Point a and Point b.

Tests round answers to 6 decimal places. Tests in Haskell will not round.


## JavaScript
```js
function distanceBetweenPoints(a,b) {
  return ((b.x-a.x)**2 + (b.y-a.y)**2 + (b.z-a.z)** 2)**.5
}
```

## Python
```python
def distance_between_points(a, b):
    return ((b.x-a.x)**2 + (b.y-a.y)**2 + (b.z-a.z)**2)**.5
```