https://www.codewars.com/kata/5612a42e746aa62de100001a

## Python
```py
import math

def db_scale(intensity):
    return 10*(math.log(intensity/10**-12)/math.log(10))
```

## JavaScript
```js
function dBScale(i) {
  return 10 * Math.log(i/(10**-12)) / Math.log(10);
}
```