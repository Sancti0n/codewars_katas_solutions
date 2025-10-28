https://www.codewars.com/kata/56143efa9d32b3aa65000016

## Python
```python
import math

def sum_circles(*args):
    s = 0
    for i in args:
        s += math.pi*(i/2)**2
    return 'We have this much circle: ' + str(round(s))
```

## JavaScript
```js
function sumCircles(...arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    s += Math.PI*(arr[i]/2)**2
  }
  return "We have this much circle: " + Math.round(s).toString()
}
```