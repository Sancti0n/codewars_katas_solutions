https://www.codewars.com/kata/58417e9ab9c25c774500001f

## Python
```py
import math

def missing_angle(h, a, o):
    if h == 0: h = (a*a + o*o)**.5
    if a == 0: a = (h*h - o*o)**.5
    return round(math.degrees(math.acos(a/h)))
```

## JavaScript
```js
function missingAngle(h,a,o) {
  if (h == 0) h = (a*a + o*o)**.5;
  if (a == 0) a = (h*h - o*o)**.5;
  return Math.round(Math.acos(a/h)*180/Math.PI)
}
```