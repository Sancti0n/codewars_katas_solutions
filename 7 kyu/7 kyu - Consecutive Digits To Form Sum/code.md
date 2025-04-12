Positive integers have so many gorgeous features. Some of them could be expressed as a sum of two or more consecutive positive numbers.
Consider an Example :

10 could be expressed as the sum of 1 + 2 + 3 + 4 .

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