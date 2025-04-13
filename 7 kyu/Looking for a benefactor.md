Task

The function should return the expected donation (rounded up to the next integer) that will permit to reach the average.

Should the last donation be a non positive number (<= 0) John wants us either to throw an error or return such value so he will clearly see that his expectations are not great enough.

In "Sample Tests" you can see what to return.
Notes:

    all donations and new average are numbers (integers or floats), array of donations can be empty.
    See examples below and "Sample Tests" to see which return is to be done.

array: [14, 30, 5, 7, 9, 11, 15], new average: 92 -> result: 645
array: [14, 30, 5, 7, 9, 11, 15], new average: 2  -> result: variable, see "Sample Tests" 

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