https://www.codewars.com/kata/58cb43f4256836ed95000f97

## Python
```python
import math

def find_difference(a, b):
    return abs(math.prod(a)-math.prod(b))
```

## PHP
```php
function findDifference($a, $b) {
  return abs(array_product($a)-array_product($b));
}
```

## JavaScript
```js
function findDifference(a, b) {
  return Math.abs(a.reduce((a, b)=> a*b, 1)-b.reduce((a, b)=> a*b, 1))
}
```

## Java
```java
public class CuboidVolumes {
  public static int multiArr(int[] a) {
    int m = 1;
    for(int i=0;i<a.length;i++) {
        m *= a[i];
    }
    return m;
  }
  
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    return Math.abs(multiArr(firstCuboid)-multiArr(secondCuboid));
  }
}
```