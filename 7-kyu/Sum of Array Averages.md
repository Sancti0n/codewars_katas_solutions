https://www.codewars.com/kata/56d5166ec87df55dbe000063

## Python
```python
import math

def sum_average(arr):
    s = 0
    for i in arr:
        s += sum(i)/len(i)
    return math.floor(s)
```

## JavaScript
```js
const sumArr = (arr) => {
  return arr.reduce((previousValue, currentValue) => previousValue + currentValue, 0)
}

const sumAverage = (arr) => {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    s += sumArr(arr[i])/arr[i].length;
  }
  return Math.floor(s)
}
```

## PHP
```php
function sumAverage($arr) {
  $s = 0;
  for ($i=0;$i<count($arr);$i++) {
    $s += array_sum($arr[$i])/count($arr[$i]);
  }
  return floor($s);
}
```