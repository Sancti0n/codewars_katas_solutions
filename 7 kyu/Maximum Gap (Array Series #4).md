https://www.codewars.com/kata/5a7893ef0025e9eb50000013

## Python
```python
def max_gap(numbers):
    numbers.sort()
    m = 0
    for i in range(len(numbers)-1):
        if numbers[i+1]-numbers[i]>m: m = numbers[i+1]-numbers[i]
    return m
```

## JavaScript
```js
function maxGap (numbers){
  numbers.sort((a,b)=>a-b);
  let m = 0;
  for (let i=0;i<numbers.length-1;i++) {
    if (numbers[i+1]-numbers[i]>m) m = numbers[i+1]-numbers[i];
  }
  return m
}
```