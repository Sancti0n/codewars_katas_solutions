https://www.codewars.com/kata/5732d3c9791aafb0e4001236

## Python
```python
import math

def round_it(n):
    t = str(n).split(".")
    if len(t[0])>len(t[1]): return math.floor(n)
    if len(t[0])<len(t[1]): return math.ceil(n)
    return round(n)
```

## JavaScript
```js
function roundIt(n){
  t = n.toString().split(".")
  if (t[0].length>t[1].length) return Math.floor(n)
  if (t[0].length<t[1].length) return Math.ceil(n)
  return Math.round(n)
}
```