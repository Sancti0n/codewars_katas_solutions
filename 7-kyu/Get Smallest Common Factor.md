https://www.codewars.com/kata/5933af2db328fbc731000010

## JavaScript
```js
function gcd(a, b) {
  if (b === 0) return a
  return gcd(b, a%b)
}

function scf(array) {
  if (array.length<1) return 1
  let res = array[0];
  for (let i=1;i<array.length;i++) {
    res = gcd(array[i], res);
    if (res === 1) return 1
  }
  for (let j=2;j<=res**.5;j++) {
    if (res%j == 0) return j
  }
  return res
}
```

## Python
```py
import math

def scf(arr):
    if len(arr)<1: return 1
    res = arr[0]
    for i in range(1, len(arr)):
        res = math.gcd(arr[i], res)
        if res == 1: return 1
    for j in range(2, int(res**.5)+1):
        if res%j == 0: return j
    return res
```