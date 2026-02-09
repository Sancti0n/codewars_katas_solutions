https://www.codewars.com/kata/5dc31e0475b58d0014236a60

## Java
```java
import java.math.BigInteger;

public class KidMath {
  
  public static BigInteger pow(BigInteger base, BigInteger exponent) {
    BigInteger i = BigInteger.ONE;
    BigInteger s = base.multiply(base);
    if (exponent.equals(i)) return base;
    if (exponent.compareTo(BigInteger.ONE) == -1) return new BigInteger("-1");
    while (i.compareTo(exponent.subtract(BigInteger.ONE)) < 0) {
      s = s.multiply(s);
      i = i.add(BigInteger.ONE);
    }
    return s;
  }
}
```