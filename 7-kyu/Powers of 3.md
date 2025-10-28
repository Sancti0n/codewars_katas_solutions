https://www.codewars.com/kata/57be674b93687de78c0001d9

## Python
```python
import math

def largest_power(N):
    if N == 1: return -1
    if N <= 3: return 0
    if 3**int(math.log(N)/math.log(3)) == N: return int(math.log(N)/math.log(3))-1
    return int(math.log(N)/math.log(3))
```

## JavaScript
```js
function largestPower(n){
  if (n == 1) return -1
  if (n <= 3) return 0
  if (3**parseInt(Math.log(n)/Math.log(3)) == n) return parseInt(Math.log(n)/Math.log(3)) - 1
  return parseInt(Math.log(n)/Math.log(3))
}
```