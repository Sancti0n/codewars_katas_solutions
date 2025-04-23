https://www.codewars.com/kata/5254bd1357d59fbbe90001ec

## Python
```python
def get_score(n):
    i, s = 1, 50
    while i<n:
        s += 50*(i+1)
        i += 1
    return s
```

## JavaScript
```js
function getScore(n) {
  return n*(n+1)*25
}
```

## PHP
```php
function get_score(int $n): int {
  return $n*($n+1)*25;
}
```

## Java
```java
public class Sequence {
    public static long getScore(long n) {
        return n*(n+1)*25;
    }
}
```