https://www.codewars.com/kata/57aa218e72292d98d500240f

## Java
```java
public class Kata {
  public static double heron(double a, double b, double c) {
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
}
```

## JavaScript
```js
function heron(a,b,c) {
  let s = (a+b+c)/2
  return Math.sqrt(s*(s-a)*(s-b)*(s-c))
}
```

## Python
```python
import math
def heron(a,b,c):
    s = (a+b+c)/2
    return round(math.sqrt(s*(s-a)*(s-b)*(s-c)), 2)
```

## PHP
```php
function heron($a, $b, $c) {
  $s = ($a+$b+$c)/2;
  return sqrt($s*($s-$a)*($s-$b)*($s-$c));
}
```