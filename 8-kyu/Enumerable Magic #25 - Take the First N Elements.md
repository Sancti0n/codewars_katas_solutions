https://www.codewars.com/kata/545afd0761aa4c3055001386

## JavaScript
```js
function take(arr, n) {
  return arr.slice(0,n)
}
```

## Java
```java
import java.util.Arrays;

public class ZywOo {
  public static int[] take(int[] arr, int n) {
    if (arr.length==0 || n>=arr.length) return arr;
    return Arrays.copyOfRange(arr,0,n);
  }
}
```

## Python
```python
def take(arr,n):
    return arr[:n]
```