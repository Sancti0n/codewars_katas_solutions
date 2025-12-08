https://www.codewars.com/kata/58da7ae9b340a2440500009c

## JavaScript
```js
function pointInCircle(x,y) {
  return x<1 && y<1 && (x**2 +y**2)**.5<1
}
```

## Python
```py
def point_in_circle(x, y):
    return x<1 and y<1 and (x**2 + y**2)**.5<1
```

## Java
```java
public class Kata {
  public static boolean pointInCircle(double x, double y) {
    return x*x + y*y<1;
  }
}
```