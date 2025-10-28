https://www.codewars.com/kata/5a91a7c5fd8c061367000002

## Python
```python
def minimum_steps(numbers, value):
    numbers.sort()
    c, s = 0, 0
    while s<value:
        s += numbers[c]
        c += 1
    return c-1
```

## JavaScript
```js
function minimumSteps(numbers, value) {
  numbers.sort((a,b)=>a-b);
  let c = 0, s = 0;
  while (s<value) {
    s += numbers[c];
    c++;
  }
  return c-1
}
```

## PHP
```php
function minimumSteps($nums, $value) {
  sort($nums);
  $c = 0;
  $s = 0;
  while ($s<$value) {
    $s += $nums[$c];
    $c++;
  }
  return $c-1;
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static int minimumSteps(int[] numbers, int k) {
    Arrays.sort(numbers);
    int c = 0;
    int s = 0;
    while (s<k) {
      s += numbers[c];
      c++;
    }
    return c-1;
  }
}
```