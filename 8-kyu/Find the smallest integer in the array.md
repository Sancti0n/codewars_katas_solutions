https://www.codewars.com/kata/55a2d7ebe362935a210000b2

## Python
```py
def find_smallest_int(arr):
    return min(arr)
```

## JavaScript
```js
class SmallestIntegerFinder {
  findSmallestInt(args) {
    return Math.min(...args)
  }
}
```

## PHP
```php
function smallestInteger ($arr) {
  return min($arr);
}
```

## Java
```java
import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
```