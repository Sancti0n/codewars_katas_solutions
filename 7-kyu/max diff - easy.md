https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095

## JavaScript
```js
function maxDiff(list) {
  return list.length ? Math.max(...list) - Math.min(...list) : 0;
};
```

## Python
```python
def max_diff(lst):
    if len(lst)<1: return 0
    return max(lst)-min(lst)
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static int maxDiff(int[] lst) {
    if (lst.length<1) return 0;
    Arrays.sort(lst);
    return lst[lst.length-1]-lst[0];
  }
}
```