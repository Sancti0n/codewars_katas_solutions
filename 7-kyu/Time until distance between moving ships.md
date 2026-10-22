https://www.codewars.com/kata/5d4dd5c9af0c4c0019247110

## Python
```py
import math

def find_time_to_break(bearing_A, bearing_B):
    angle_diff = 180 - abs(abs(bearing_A - bearing_B) - 180)

    if angle_diff == 0:
        return float('inf')

    x = 90 * math.sqrt(2 * (1 - math.cos(math.radians(angle_diff))))
    
    if x == 0:
        return float('inf')
    return round(2400 / x, 2)
```

## JavaScript
```js
function findTimeToBreak(bearingA, bearingB) {
  const angle = 180 - Math.abs(bearingA - bearingB - 180);
  if (angle == 0) {
    return Infinity;
  }
  const x = 90 * Math.sqrt(2 * (1 - Math.cos( angle * (Math.PI / 180))));
  if (x == 0) {
    return Infinity;
  }
  return Math.round(240000 / x)/100;
}
```