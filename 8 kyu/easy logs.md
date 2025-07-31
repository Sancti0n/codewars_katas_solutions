https://www.codewars.com/kata/5b68c7029756802aa2000176

## Python
```python
import math
def logs(x, a, b):
    return math.log(a,x)+math.log(b,x)
```

## JavaScript
```js
function logs(x, a, b) {
  return (Math.log(a)+Math.log(b))/Math.log(x)
}
```

## Java
```java
import java.lang.*;

public class EasyLogs {

  public static double logs(double x, double a, double b) {
    return Math.log(a*b)/Math.log(x);
  }
}
```