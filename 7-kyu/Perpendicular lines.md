https://www.codewars.com/kata/6391fe3f322221003db3bad6

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