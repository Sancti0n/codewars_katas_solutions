Your task is to check whether a segment is completely in one quadrant or it crosses more. Return true if the segment lies in two or more quadrants. If the segment lies within only one quadrant, return false.

There are two parameters: A (coord) and B (coord), the endpoints defining the segment AB.

No coordinate will be zero; expect that all X and Y are positive or negative.
Examples

This whole segment is in the first quadrant.
```
[(1, 2), (3, 4)] -> false
[(9, 3), (-1, 6)] -> true
[(-1, 6), (-9, 1)] -> false
```

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