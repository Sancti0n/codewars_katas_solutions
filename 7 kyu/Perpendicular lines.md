You are given an input (n) which represents the amount of lines you are given, your job is to figure out what is the maximum amount of perpendicular lines you can make using these lines.

Note: A perpendicular line is one that forms a 90 degree angle

n will always be greater than or equal to 0


## JavaScript
```js
function maxBisectors(n) {
  return n % 2 == 0 ? n**2 / 4 : (n**2 -1) /4
}
```

## Python
```python
import math

def perpendicular(n):
    return math.floor(n * n / 4)
```

## Java
```java
public class Perpendicular {
  public static long maxBisectors(long n) {
    return n%2>0 ? (long) (n*n -1)/4 : (long) n*n/4;
  }
}
```