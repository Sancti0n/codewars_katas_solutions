https://www.codewars.com/kata/52f787eb172a8b4ae1000a34

## Python
```python
import math
def zeros(n):
    z, k = 0, 1
    if n == 0: return 0
    else:
        kmax = math.log(n,5)
        while k<kmax:
            z += n//(5**k)
            k += 1
        return z
```

## JavaScript
```js
function zeros (n) {
  let z = 0;
  let k = 1;
  if (n === 0) return 0
  else {
    let kmax = Math.log(n,5);
    while (k<kmax) {
      z += Math.floor(n/(5**k));
      k++;
    }
    return z; 
  }
}
```