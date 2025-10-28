https://www.codewars.com/kata/5c5086287bc6600001c7589a

## Python
```python
def is_negative_zero(n):
    return n == -0.0 and '-' in str(n)
```

## JavaScript
```js
function isNegativeZero(n) {
  return Object.is(-0,n)
}
```

## Java
```java
public class NegativeZeroValidator {
  public static boolean isNegativeZero(float n) {
    return n == -0f && String.valueOf(n).contains("-");
  }
}
```