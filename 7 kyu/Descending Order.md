https://www.codewars.com/kata/5467e4d82edf8bbf40000155

## Python
```python
def descending_order(num):
    return int("".join(sorted(str(num), reverse = True)))
```

## JavaScript
```js
function descendingOrder(n){
  return Number(n.toString().split('').sort().reverse().join(''))
}
```

## PHP
```php
function descendingOrder(int $n): int {
  $t = str_split(strval($n));
  rsort($t);
  return intval(implode("", $t));
}
```

## Java
```java
import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] t = String.valueOf(num).split("");
    Arrays.sort(t, Collections.reverseOrder());
    return Integer.parseInt(String.join("", t));
  }
}
```

## TypeScript
```ts
export function descendingOrder(n: number): number {
  return Number(n.toString().split('').sort().reverse().join(''))
}
```