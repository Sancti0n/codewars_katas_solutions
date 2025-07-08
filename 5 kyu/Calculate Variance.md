https://www.codewars.com/kata/5266fba01283974e720000fa/train/python

## Python
```python
def variance(numbers):
    s = 0
    m = sum(numbers)/len(numbers)
    for i in range(len(numbers)):
        s += (numbers[i]-m)**2
    return s/len(numbers)
```

## JavaScript
```js
var variance = function(numbers) {
  let s = 0;
  let m = numbers.reduce((p, c) => p + c, 0)/numbers.length;
  for (let i=0;i<numbers.length;i++) {
    s += (numbers[i]-m)**2;
  }
  return s/numbers.length
};
```