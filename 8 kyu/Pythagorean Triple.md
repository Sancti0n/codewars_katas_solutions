https://www.codewars.com/kata/5951d30ce99cf2467e000013

## Python
```python
def pythagorean_triple(arr):
    arr.sort()
    return arr[2]**2 == arr[0]**2 + arr[1]**2
```

## JavaScript
```js
function isPythagoreanTriple(arr) {
  arr.sort(function(a, b) {return a - b;});
  return arr[2]**2 == arr[0]**2 + arr[1]**2
}
```

## Java
```java
import java.util.Arrays;

public class PythagoreanTriple {
	public int pythagoreanTriple(int[] arr){
	  Arrays.sort(arr);
    double epsilon = 0.000001d;
    if (Math.abs(Math.pow(arr[2],2) - Math.pow(arr[0],2) - Math.pow(arr[1],2)) < epsilon) {
      return 1;
    }
    return 0;
  }
}
```

## PHP
```php
function pythagorean_triple($arr) {
  sort($arr);
  return $arr[2]**2 == $arr[0]**2 + $arr[1]**2;
}
```