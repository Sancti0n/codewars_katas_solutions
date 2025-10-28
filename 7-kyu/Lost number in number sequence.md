https://www.codewars.com/kata/595aa94353e43a8746000120

## Python
```python
def find_deleted_number(arr, mixed_arr):
    return sum(arr)-sum(mixed_arr)
```

## PHP
```php
function findDeletedNumber(array $arr, array $mixedArr): int {
  return array_sum($arr)-array_sum($mixedArr);
}
```

## JavaScript
```js
function findDeletedNumber(arr, mixArr) {
  return arr.reduce((a, b) => a + b,0)-mixArr.reduce((a, b) => a + b,0)
}
```

## Java
```java
public class Kata {
  public static int findDeletedNumber(int[] arr, int[] mixedArr) {
    int s1 = 0;
    int s2 = 0;
    for (int i=0;i<arr.length;i++) s1 = s1 + arr[i];
    for (int j=0;j<mixedArr.length;j++) s2 = s2 + mixedArr[j];
    return s1-s2;
    }
}
```