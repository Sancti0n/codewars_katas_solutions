https://www.codewars.com/kata/59f34ec5a01431ab7600005a

## Python
```python
import math

def count(n):
  return math.floor((math.log(2*math.pi*n)/2+n*(math.log(n)-1))/math.log(10))+1
```

## JavaScript
```js
function count(n) {
  return Math.floor((Math.log(2*Math.PI*n)/2+n*(Math.log(n)-1))/Math.log(10))+1
}
```