Write a function which calculates the average of the numbers in a given array.

Note: Empty arrays should return 0.

## Python
```python
def find_average(n):
    return 0 if len(n) == 0 else sum(n)/len(n)
```

## JavaScript
```js
function find_average(arr) {
  if (arr.length == 0) return 0
  return (arr.reduce((a, b) => a + b,0))/arr.length
}
```

## Java
```java
public class Kata{
  public static double find_average(int[] array){
    int s = 0;
    for (int v : array) {
        s += v;
    }
    return (double) s/array.length;
  }
}
```

## PHP
```php
function find_average($arr) {
  return array_sum($arr)/count($arr);
}
```