https://www.codewars.com/kata/559590633066759614000063

## Python
```python
def min_max(lst):
    return [min(lst), max(lst)]
```

## JavaScript
```js
function minMax(arr){
  return [Math.min(...arr), Math.max(...arr)]
}
```

## Java
```java
import java.util.*;

class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return new int[] {min, max};
    }
}
```