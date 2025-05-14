https://www.codewars.com/kata/602db3215c22df000e8544f0

## Python
```python
def two_are_positive(a, b, c):
    t = [a,b,c]
    t.sort()
    return t[1]>0 and t[0]<=0
```

## JavaScript
```js
function twoArePositive(a, b, c) {
  let t = [a,b,c];
  t.sort((a,b)=>a-b);
  return t[0]<=0 && t[1]>0
}
```

## PHP
```php
function twoArePositive(int $a, int $b, int $c): bool {
  $t = [$a,$b,$c];
  sort($t);
  return $t[0]<=0 && $t[1]>0;
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static boolean twoArePositive(int a, int b, int c) {
    int[] t = {a,b,c};
    Arrays.sort(t);
    return t[1]>0 && t[0]<=0;
  }
}
```