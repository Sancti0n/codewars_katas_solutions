https://www.codewars.com/kata/643ea1adef815316e5389d17

## Python
```python
import math

def quadrant_segment(A, B):
    return False if math.copysign(1, A.x) == math.copysign(1, B.x) and math.copysign(1, A.y) == math.copysign(1, B.y) else True
```

## JavaScript
```js
function quadrantSegment(A, B) {
  return A.x * B.x < 0 || A.y * B.y < 0;
}
```