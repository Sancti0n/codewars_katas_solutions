https://www.codewars.com/kata/5a9c35e9ba1bb5c54a0001ac

## Java
```java
public class Solution {
  public static int add(int x, int y){
    if (y == 0) return x;
    else return add(x^y, (x&y) << 1);
  }
}
```

## PHP
```php
function add (int $x, int $y): int {
  while ($y != 0) {
    $carry = $x & $y;
    $x = $x ^ $y;
    $y = $carry << 1;
  }
  return $x;
}
```

## JavaScript
```js
function add(x, y) {
  if (y == 0) return x
  else return add(x^y, (x&y) << 1)
}
```