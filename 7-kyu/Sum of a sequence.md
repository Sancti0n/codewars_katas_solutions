https://www.codewars.com/kata/586f6741c66d18c22800010a

## Python
```python
def sequence_sum(s, e, step):
    return sum(range(s, e+1, step))
```

## PHP
```php
function sequence_sum(int $b, int $e, int $step): int {
  $s = 0;
  while ($b<=$e) {
    $s += $b;
    $b += $step;
  }
  return $s;
}
```

## JavaScript
```js
const sequenceSum = (b, e, step) => {
  let s = 0;
  while (b<=e) {
    s += b;
    b += step;
  }
  return s
}
```

## Java
```java
public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    int s = 0;
    while (start<=end) {
      s += start;
      start += step;
    }
    return s;
  }
}
```