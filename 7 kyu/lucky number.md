https://www.codewars.com/kata/55afed09237df73343000042

## Python
```python
def is_lucky(n):
    return sum([int(i) for i in str(n)])%9 == 0
```

## JavaScript
```js
function isLucky(n) {
  return n%9 == 0
}
```

## Java
```java
public class LuckyNumber {
  public static boolean isLucky(long n) {
    return n%9 == 0;
  }
}
```