https://www.codewars.com/kata/552ab0a4db0236ff1a00017a

## Python
```python
import math

def sillycase(silly):
    return silly[:math.ceil(len(silly)/2)].lower() + silly[math.ceil(len(silly)/2):].upper()
```

## JavaScript
```js
function sillycase(silly) {
  return silly.slice(0, Math.ceil(silly.length/2)).toLowerCase() + silly.slice(Math.ceil(silly.length/2)).toUpperCase()
}
```