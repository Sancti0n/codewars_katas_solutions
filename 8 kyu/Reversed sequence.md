https://www.codewars.com/kata/5a00e05cc374cb34d100000d

## JavaScript
```js
const reverseSeq = n => {
  return [...Array(n).keys()].map(x=>x+1).reverse()
}
```

## Python
```python
def reverse_seq(n):
    return list(range(n, 0, -1))
```

## PHP
```php
function reverseSeq ($n) {
  return range($n, 1);
};
```

## Java
```java
import java.util.Arrays;

public class Sequence{
  public static int[] reverse(int n){
    int[] arr = new int[n];
    Arrays.setAll(arr, i->n-i);
    return arr;
  }
}
```