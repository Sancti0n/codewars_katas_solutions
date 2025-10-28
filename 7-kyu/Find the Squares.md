https://www.codewars.com/kata/60908bc1d5811f0025474291

## JavaScript
```js
const findSquares = num => {
  let i = 1;
  while ((i+1)**2 - i**2 != num) {
    i++;
  }
  return `${(i+1)**2}-${i**2}`
};
```

## Python
```python
import math

def find_squares(num):
    max = math.ceil(num/2)
    min = num - max
    return f'{max**2}-{min**2}'
```