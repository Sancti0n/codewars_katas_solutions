https://www.codewars.com/kata/555f43d8140a6df1dd00012b

## Python
```python
import math

def coordinates(degrees, radius):
    x = radius*math.cos(degrees*math.pi/180)
    y = radius*math.sin(degrees*math.pi/180)
    return (round(x,10),round(y,10))
```

## JavaScript
```js
function coordinates(degrees, radius) {
  let x = Math.round((radius*Math.cos(degrees*Math.PI/180))*(10**10))/(10**10);
  let y = Math.round((radius*Math.sin(degrees*Math.PI/180))*(10**10))/(10**10);
  return [x,y]
}
```

## Java
```java
import java.awt.geom.Point2D;

public class CoordinatesInspector {
  public static Point2D coordinates(double degrees, double radius) {
    double x = Math.round((radius*Math.cos(degrees*Math.PI/180))*Math.pow(10, 10))/Math.pow(10, 10);
    double y = Math.round((radius*Math.sin(degrees*Math.PI/180))*Math.pow(10, 10))/Math.pow(10, 10);
    return new Point2D.Double(x, y);
  }
}
```