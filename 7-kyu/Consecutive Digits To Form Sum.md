https://www.codewars.com/kata/5dae2599a8f7d90025d2f15f

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