https://www.codewars.com/kata/5a026a9cffe75fbace00007f

## Python
```py
import math

def circle_diameter(sides, side_length):
    P = sides*side_length
    S = (sides*side_length**2)/(math.tan(math.pi/sides))
    return S/P
```

## Java
```java
public class Polygon {
  int sides;
  int sideLength;

  public Polygon(int sides, int sideLength) {
    this.sides = sides;
    this.sideLength = sideLength;
  }
  
  public double circleDiameter() {
    double P = sides*sideLength;
    double S = sides*Math.pow(sideLength, 2) / Math.tan(Math.PI/sides);
    return S/P;
  }
}
```