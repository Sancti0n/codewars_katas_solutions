https://www.codewars.com/kata/54d4c8b08776e4ad92000835

## Python
```py
import math
def isPP(n):
    v = int(math.sqrt(n))
    i = 2
    N = math.log(n)
    while i<=v:
        if i**round(N/math.log(i)) == n:
            return [i, round(N/math.log(i))]
        i += 1
    return None
```

## JavaScript
```js
var isPP = function(n){
  let v = parseInt(Math.sqrt(n));
  let i = 2;
  let N = Math.log(n);
  while (i<=v) {
    if (i**Math.round(N/Math.log(i)) === n) return [i, Math.round(N/Math.log(i))]
    i += 1;
  }
  return null
}
```