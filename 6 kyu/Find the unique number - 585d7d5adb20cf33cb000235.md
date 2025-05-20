https://www.codewars.com/kata/585d7d5adb20cf33cb000235

## Python
```python
def find_uniq(arr):
    arr.sort()
    if arr.count(arr[0])>1: return arr[len(arr)-1]
    return arr[0]
```

## JavaScript
```js
function findUniq(arr) {
  arr.sort();
  if (arr.filter(elt => elt === arr[0]).length>1) return arr[arr.length-1]
  return arr[0]
}
```

## PHP
```php
function find_uniq($a) {
  $i = 2;
  if ($a[0] == $a[1]) {
    while ($i<count($a)) {
      if ($a[0] != $a[$i]) return $a[$i];
      $i++;
    }
  }
  else 
    if ($a[0] == $a[2]) return $a[1];
    else return $a[0];
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static double findUniq(double arr[]) {
    Arrays.sort(arr);
    if (arr[0]==arr[1]) return arr[arr.length-1];
    return arr[0];
  }
}
```