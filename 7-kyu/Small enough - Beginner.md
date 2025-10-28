https://www.codewars.com/kata/57cc981a58da9e302a000214

## Python
```python
def small_enough(array, limit):
    array.sort()
    return array[-1]<=limit
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static boolean smallEnough(int[] a, int limit) {
    Arrays.sort(a);
    return a[a.length-1]<=limit;
  }
}
```

## PHP
```php
function smallEnough($a, $limit) {
  sort($a);
  return $a[count($a)-1]<=$limit;
}
```

## JavaScript
```js
function smallEnough(a, limit){
  a.sort(function(b, c) { return b - c; });
  return a[a.length-1]<=limit
}
```