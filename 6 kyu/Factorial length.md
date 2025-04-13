In this Kata, you will implement a function count that takes an integer and returns the number of digits in factorial(n).

For example, count(5) = 3, because 5! = 120, and 120 has 3 digits.

Brute force is not possible. A little research will go a long way, as this is a well known series.

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