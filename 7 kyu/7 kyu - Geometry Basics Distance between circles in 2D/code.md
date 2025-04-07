This series of katas will introduce you to basics of doing geometry with computers.

Point objects have x, y attributes. Circle objects have center which is a Point, and radius which is a number.

Write a function calculating distance between Circle a and Circle b.

If they're overlapping or one is completely within the other, just return zero.

Tests round answers to 6 decimal places, so you don't need to round them yourselves.


## JavaScript
```js
function distanceBetweenCircles(a, b) {
  let v = ((b.center.x-a.center.x)**2 + (b.center.y-a.center.y)**2)**.5 - a.radius - b.radius;
  return v<0 ? 0 : v
}
```

## Python
```python
def distance_between_circles(a, b):
    v = ((b.center.x-a.center.x)**2 + (b.center.y-a.center.y)**2)**.5 - a.radius - b.radius
    return 0 if v<0 else v
```