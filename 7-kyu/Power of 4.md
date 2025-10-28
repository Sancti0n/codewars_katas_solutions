https://www.codewars.com/kata/544d114f84e41094a9000439

## Python
```python
import math

def powerof4(n):
    if type(n) is int and n >= 0:
        return math.log(n)/math.log(4) == int(math.log(n)/math.log(4))
    return False
```

## JavaScript
```js
function powerOf4(n) {
  if (typeof n == "number" && n>=0) {
    return parseInt(Math.log(n)/Math.log(4)) == Math.log(n)/Math.log(4)
  }
  return false
}
```