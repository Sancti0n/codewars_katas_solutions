https://www.codewars.com/kata/5748838ce2fab90b86001b1a

## Python
```python
import math
def square_area(A):
    return round(((A*2)/math.pi)**2, 2)
```

## PHP
```php
function square_area($A) {
  return round((($A*2)/M_PI)**2, 2);
}
```

## JavaScript
```js
function squareArea(A){
  return Math.round(100*(((A*2)/Math.PI)**2))/100
}
```

## Java
```java
public class Geometry{
  public static double squareArea(double A){
    return (double) Math.round(Math.pow(((A*2)/Math.PI),2) * 100)/100;
  }
}
```