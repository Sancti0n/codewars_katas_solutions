https://www.codewars.com/kata/569b5cec755dd3534d00000f

## JavaScript
```js
function newAvg(arr, newavg) {
  let s = (arr.length+1)*newavg - arr.reduce((p, c) => p + c, 0);
  if (s<=0) throw new TypeError("Expected New Average is too low");
  return Math.ceil(s)
}
```

## Python
```python
from math import *

def new_avg(arr, newavg):
    s = (len(arr)+1)*newavg - sum(arr)
    if s<=0: raise Exception("Error expected")
    else: return ceil(s)
```

## PHP
```php
function newAvg($arr, $newavg) {
  $s = (count($arr)+1)*$newavg - array_sum($arr);
  if ($s<=0) throw new InvalidArgumentException('Expected New Average is too low');
  return ceil($s);
}
```

## Java
```java
public class NewAverage {
  public static double sum(double[] arr) {
    double sum = 0;
    for (int i=0;i<arr.length;i++) sum += arr[i];
    return sum;
  }
  
  public static long newAvg(double[] arr, double navg) {
    double s = (arr.length+1) * navg - sum(arr);
    if (s<=0) throw new IllegalArgumentException("Expected New Average is too low");
    return (long) Math.ceil(s);
  }
}
```