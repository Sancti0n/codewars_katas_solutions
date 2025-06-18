https://www.codewars.com/kata/5a805d8cafa10f8b930005ba

## Python
```python
def nearest_sq(n):
    return round(n**0.5)**2
```

## JavaScript
```js
function nearestSq(n){
    return Math.round(n**0.5)**2
}
```

## Java
```java
import java.lang.Math;

public class CodeWarsMath {
  public static int nearestSq(final int n){
    int v = (int) Math.round(Math.sqrt(n));
    return (int) Math.pow(v,2);
  }
}
```