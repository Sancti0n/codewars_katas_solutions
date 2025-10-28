https://www.codewars.com/kata/57d52a7f76da830e43000188

## Python
```python
import math

def sctc(sin):
    v = math.asin(sin)
    t = [round(sin, 2), round(math.cos(v), 2)]
    if round(math.cos(v), 2) != 0.0:
        t.append(round(math.tan(v), 2))
    if sin != 0:
        t.append(round(math.cos(v)/sin, 2))
    return t
```

## JavaScript
```js
function sctc(sin) {
  let v = Math.asin(sin);
  let t = [Math.round(sin*100)/100, Math.round(Math.cos(v)*100)/100];
  if (Math.round(Math.cos(v)*100)/100 != 0) {
    t.push(Math.round(Math.tan(v)*100)/100);
  }
  if (sin != 0) {
    t.push(Math.round((Math.cos(v)/sin)*100)/100)
  }
  return t
}
```