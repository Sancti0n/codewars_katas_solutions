https://www.codewars.com/kata/57cc975ed542d3148f00015b

## Python
```python
def check(seq, elem):
    return elem in seq
```

## JavaScript
```js
function check(a, x) {
  return a.indexOf(x)>-1
}
```

## PHP
```php
function solution($a, $x) {
  return in_array($x, $a);
}
```

## Java
```java
import java.util.*;

public class Solution {
  public static boolean check(Object[] a, Object x) {
    return Arrays.asList(a).contains(x);
  }
}
```