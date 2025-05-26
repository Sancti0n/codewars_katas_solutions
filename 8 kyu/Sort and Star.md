https://www.codewars.com/kata/57cfdf34902f6ba3d300001e

## Python
```python
def two_sort(array):
    array.sort()
    w = ""
    for i in range(len(array[0])):
        if i+1 == len(array[0]): w += array[0][i]
        else: w += array[0][i] + "*"*3
    return w
```

## JavaScript
```js
function twoSort(s) {
  s.sort()
  return s[0].split("").join("***")
}
```

## PHP
```php
function twoSort($s) {
  sort($s);
  return implode("***", str_split($s[0]));
}
```

## Java
```java
import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String[] w = s[0].split("");
        for (int i=0;i<w.length-1;i++) {
            w[i] = w[i] + "***";
        }
        return String.join("", w);
    }
}
```