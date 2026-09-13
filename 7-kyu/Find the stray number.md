https://www.codewars.com/kata/57f609022f4d534f05000024

## JavaScript
```js
function stray(numbers) {
  numbers.sort();
  let a = numbers[0];
  let b = numbers.slice(1);
  if (b.indexOf(a)>-1) return numbers[numbers.length-1]
  return a;
}
```

## Python
```py
def stray(arr):
    for x in arr:
        if arr.count(x) == 1: return x
```

## PHP
```php
function stray($arr) {
  sort($arr);
  $a = $arr[0];
  $b = array_slice($arr, 1);
  if (in_array($a, $b)) return $arr[count($arr)-1];
  return $a;
}
```

## Java
```java
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
  static int stray(int[] numbers) {
    Arrays.sort(numbers);
    int a = numbers[0];
    int[] b = new int[numbers.length-1];
    for (int i=1;i<numbers.length;i++) {
      b[i-1] = numbers[i];
    }
    boolean result = IntStream.of(b).anyMatch(x -> x == a);
    if (result) return numbers[numbers.length-1];
    return a;
  }
}
```