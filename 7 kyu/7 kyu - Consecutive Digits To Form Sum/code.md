## Python
```python
def consecutive_ducks(n):
    return (n & (n-1) != 0) and n != 0
```

## JavaScript
```js
function consecutiveDucks(n) {
  return (n & (n-1)) != 0 && n != 0
}
```

## Java
```java
public class Kata {
  public static boolean consecutiveDucks(int n) {
    return (n & (n-1)) != 0 && n != 0;
  }
}
```