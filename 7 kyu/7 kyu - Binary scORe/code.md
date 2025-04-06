Given a number n we will define its scORe to be 0 | 1 | 2 | 3 | ... | n, where | is the bitwise OR operator.

Write a function that takes n and finds it's scORe.


## JavaScript
```js
function score(n) {
   if (n === 0) return 0
   return 2**(n.toString(2).length)-1
}
```

## Python
```python
def score(n):
    if n == 0: return 0
    return int(''.join([str(1) for i in range(len("{:b}".format(n)))]), 2)
```

## PHP
```php
function score(int $n): int {
  if ($n == 0) return 0;
  return 2**(strlen(decbin($n)))-1;
}
```

## Java
```java
import java.math.BigInteger;

public class BinaryScore {
  public static BigInteger score (BigInteger n) {
    BigInteger b1 = new BigInteger("0");
    if (b1.equals(n)) return b1;
    return new BigInteger("2").pow(n.toString(2).length()).subtract(new BigInteger("1"));
  }
}
```