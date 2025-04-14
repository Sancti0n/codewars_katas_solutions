https://www.codewars.com/kata/56cafdabc8cfcc3ad4000a2b

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