https://www.codewars.com/kata/582f52208278c6be55000067

## JavaScript
```js
function roundToFive(numbers) {
  let a = 0, b = 0;
  for (let i=0;i<numbers.length;i++) {
    a = Math.ceil(numbers[i]/5)*5, b = Math.floor(numbers[i]/5)*5;
    numbers[i] = a-numbers[i] >= numbers[i]-b ? b : a;
  }
  return numbers
}
```

## Python
```python
import math

def round_to_five(arr):
    a, b = [0, 0]
    t = []
    for i in arr:
        a, b = [math.ceil(i/5)*5, math.floor(i/5)*5]
        if (i+2.5)%5 == 0: t.append(i+2.5)
        else: t.append(b if a-i >= i-b else a)
    return t
```