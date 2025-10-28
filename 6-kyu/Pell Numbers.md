https://www.codewars.com/kata/5818d00a559ff57a2f000082

## Python
```python
class Pell(object):
    def get(self, n):
        self.n = n
        if (self.n <= 2): return n
        a = 1
        b = 2
        for i in range(3, self.n+1) :
            c = 2 * b + a
            a = b
            b = c
        return b
```

## Java
```java
import java.math.BigInteger;

public class Solution {
  public static BigInteger pell(int n) {
    if (n<=2) return BigInteger.valueOf(n);
    BigInteger a = BigInteger.ONE;
    BigInteger b = BigInteger.TWO;
    BigInteger c = BigInteger.ZERO;
    for (int i=3;i<=n;i++) {
      c = a.add(BigInteger.TWO.multiply(b));
      a = b;
      b = c;
    }
    return b;
  }
}
```

## JavaScript
```js
function pell(n) {
  if (n <= 2) return BigInt(n)
  let a = BigInt(1);
  let b = BigInt(2);
  let c = BigInt(0);
  for (let i=3;i<=n;i++) {
    c = BigInt(2)*b + a;
    a = b;
    b = c;
  }
  return b
}
```