https://www.codewars.com/kata/537baa6f8f4b300b5900106c

## JavaScript
```js
var circleArea = function(radius) {
  if (radius>0) return Math.round(100*Math.PI*radius**2)/100
  return false
};
```

## Python
```python
from math import *

def circle_area(r):
    try:
        if r>0: return round(pi*r**2,2)
        return False
    except:
        return False
```

## Java
```java
public class Circle {
  public static double area(double radius) {
    try {
      if (radius>0) return Math.PI*radius*radius;
      throw new IllegalArgumentException();
    }
    catch(Exception e) {
      throw new IllegalArgumentException();
    }
  }
}
```