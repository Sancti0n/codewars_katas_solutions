https://www.codewars.com/kata/57bfea4cb19505912900012c

## Python
```py
def symmetric_point(p, q):
    return [2*q[0]-p[0], 2*q[1]-p[1]]
```

## JavaScript
```js
function symmetricPoint(p, q) {
  return [2*q[0]-p[0], 2*q[1]-p[1]]
}
```

## PHP
```php
function symmetric_point($p, $q) {
  return [2*$q[0]-$p[0], 2*$q[1]-$p[1]];
}
```

## Java
```java
package cw;

public class Reflections {
    
    public static int[] reflectPoint(int[] p, int[] q) {
        return new int[]{2*q[0]-p[0],2*q[1]-p[1]};
    }
}
```