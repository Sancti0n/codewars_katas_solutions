https://www.codewars.com/kata/5ae62fcf252e66d44d00008e

## Python
```python
def expression_matter(a, b, c):
    return max(a*b*c, a+b+c, (a+b)*c, a*(b+c))
```

## PHP
```php
function expressionMatter($a, $b, $c) {
  return max($a*$b*$c, $a+$b+$c, ($a+$b)*$c, $a*($b+$c));
}
```

## JavaScript
```js
function expressionMatter(a, b, c) {
  return Math.max(a*b*c, a+b+c, (a+b)*c, a*(b+c))
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static int expressionsMatter(int a, int b, int c) {
    int[] arr = {a*b*c, a+b+c, (a+b)*c, a*(b+c)};
    Arrays.sort(arr);
    return arr[arr.length-1];
  }
}
```