https://www.codewars.com/kata/5b6b128783d648c4c4000129

## JavaScript
```js
function smallestProduct(arr) {
  let m = 0;
  for (let i=0;i<arr.length;i++) {
    if (i==0) m = arr[i].reduce((a, b)=> a*b, 1);
    else {
      if (arr[i].reduce((a, b)=> a*b, 1)<m) m = arr[i].reduce((a, b)=> a*b, 1);
    }
  }
  return m
}
```

## Python
```python
import math

def smallest_product(a):
    m = 0
    for i in range(len(a)):
        if i == 0: m = math.prod(a[i])
        else:
            if math.prod(a[i])<m: m = math.prod(a[i])
    return m
```