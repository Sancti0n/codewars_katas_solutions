https://www.codewars.com/kata/593c9175933500f33400003e

## Python
```python
def multiples(m, n):
    return [n*i for i in range(1, m+1)]
```

## JavaScript
```js
function multiples(m, n) {
  let t = [];
  for (let i=1;i<=m;i++) {
    t.push(n*i);
  }
  return t
}
```

## PHP
```php
function multiples(int $m, float $n): array {
  $t = [];
  for ($i=1;$i<=$m;$i++) {
    $t[] = $n*$i;
  }
  return $t;
}
```

## Java
```java
import java.util.*;

public class Kata {
  public static int[] multiples(int m, int n) {
    int[] arr = new int[m];
    Arrays.setAll(arr, i->i+1);
    for (int i=1;i<=m;i++) {
      arr[i-1] = n*i;
    }
    return arr;
  }
}
```