https://www.codewars.com/kata/58e3031ce265671f6a000542

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