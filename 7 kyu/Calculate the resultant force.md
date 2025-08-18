https://www.codewars.com/kata/5b707fbc8adeaee7ac00000c

## JavaScript
```js
function solution(f1, f2, theta, ...r) {
  let F1x = f1*Math.cos(0), F1y = f1*Math.sin(0);
  let F2x = f2*Math.cos(theta*Math.PI/180), F2y = f2*Math.sin(theta*Math.PI/180);
  let Fx = F1x + F2x;
  let Fy = F1y + F2y;
  return [(Fx**2 + Fy**2)**.5, Math.atan2(Fy,Fx)*180/Math.PI]
}
```

## Python
```python
import math

def solution(f1, f2, theta):
    F1x, F1y = [f1*math.cos(0), f1*math.sin(0)]
    F2x, F2y = [f2*math.cos(theta*math.pi/180), f2*math.sin(theta*math.pi/180)]
    Fx, Fy = [F1x + F2x, F1y + F2y]
    return [(Fx**2 + Fy**2)**.5, math.atan2(Fy, Fx)*180/math.pi]
```