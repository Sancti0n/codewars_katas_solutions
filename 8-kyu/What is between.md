https://www.codewars.com/kata/55ecd718f46fba02e5000029

## Python
```python
def between(a,b):
    t = []
    i = min(a,b)
    while i<=b:
        t.append(i)
        i += 1
    return t
```

## JavaScript
```js
function between(a, b) {
  const range = (a, b, length = b - a + 1) => Array.from({ length }, (_, i) => a + i);
  return range(a,b)
}
```

## Java
```java
import java.util.Arrays;

public class Kata {

  public static int[] between(int a, int b) {
    int[] arr = new int[b-a+1];
    Arrays.setAll(arr, (i) -> a+i);
    return arr;
  }
}
```

## PHP
```php
function between(int $a, int $b): array {
  $t = [];
  for ($i=$a;$i<=$b;$i++) {
    $t[] = $i;
  }
  return $t;
}
```