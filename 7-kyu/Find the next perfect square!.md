https://www.codewars.com/kata/56269eb78ad2e4ced1000013

## Python
```py
import math
def find_next_square(sq):
    if int(math.sqrt(sq))**2 == sq: return (math.sqrt(sq)+1)**2
    return -1
```

## JavaScript
```js
function findNextSquare(sq) {
  if (parseInt(Math.sqrt(sq))**2 === sq) return (Math.sqrt(sq)+1)**2
  return -1
}
```

## Java
```java
public class NumberFun {
  public static long findNextSquare(long sq) {
    if (Math.pow((int) Math.sqrt(sq), 2) == sq) return (long) Math.pow( (int) Math.sqrt(sq)+1, 2);
    return -1;
  }
}
```