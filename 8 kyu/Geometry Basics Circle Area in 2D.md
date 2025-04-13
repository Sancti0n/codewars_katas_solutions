This series of katas will introduce you to basics of doing geometry with computers.

Write the function circleArea/CircleArea which takes in a Circle object and calculates the area of that circle.

```python
class Circle:
    def __init__(self, center, radius):
        self.center = center
        self.radius = radius
```


## JavaScript
```js
function circleArea(circle) {
  return Math.PI*circle.radius**2
}
```

## Python
```python
import math

def circle_area(circle):
    return math.pi * circle.radius**2
```