https://www.codewars.com/kata/56598d8076ee7a0759000087

## Python
```python
import math

def calculate_tip(amount, rating):
    d = {"terrible": 0, "poor": 0.05, "good": 0.1, "great": 0.15, "excellent": 0.2}
    return int(math.ceil(amount*d[rating.lower()])) if rating.lower() in d else 'Rating not recognised'
```

## JavaScript
```js
function calculateTip(amount, rating) {
  let t = {"terrible": 0, "poor": 0.05, "good": 0.1, "great": 0.15, "excellent": 0.2};
  return t.hasOwnProperty(rating.toLowerCase())? parseInt(Math.ceil(amount*t[rating.toLowerCase()])): "Rating not recognised"
}
```