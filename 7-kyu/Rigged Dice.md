https://www.codewars.com/kata/573acc8cffc3d13f61000533

## Python
```py
import random

def throw_rigged():
    l = [1, 2, 3, 4, 5, 6]
    r = random.choices(l, weights=(15.6, 15.6, 15.6, 15.6, 15.6, 22))
    return r[0]
```

## JavaScript
```js
function throwRigged() {
  if (Math.random() < 0.22) {
    return 6;
  }
  return Math.floor(Math.random() * 5) + 1;
}
```