https://www.codewars.com/kata/576b93db1129fcf2200001e6

## Python
```python
def sum_array(arr):
    if arr == None or len(arr)<3: return 0
    if len(arr)>=3: return sum(arr)-max(arr)-min(arr)
```

## JavaScript
```js
function sumArray(arr) {
  if (arr == null || arr.length<3) return 0
  if (arr.length>=3) return arr.reduce((p, c) => p + c, 0)-Math.max(...arr)-Math.min(...arr)
}
```

## PHP
```php
function sumArray($arr) {
  if ($arr == null || count($arr)<3) return 0;
  return array_sum($arr) - max($arr) - min($arr);
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static int sum(int[] numbers) {
    if (numbers == null) return 0;
    Arrays.sort(numbers);
    int sum = 0;
    for (int i=1;i<numbers.length-1;i++) sum = sum + numbers[i];
    return sum;
  }
}
```