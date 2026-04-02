import java.math.BigInteger;

public class SumFct {
  
  public static BigInteger fibo(BigInteger n) {
    BigInteger a = BigInteger.ONE;
    BigInteger b = BigInteger.ZERO;
    BigInteger s = BigInteger.ZERO;
    BigInteger sum = BigInteger.ZERO;
    BigInteger i = BigInteger.ZERO;
    while (i.compareTo(n) < 0) {
      s = a.add(b);
      sum = sum.add(s);
      b = a;
      a = s;
      i=i.add(BigInteger.ONE);
    }
    sum = sum.add(BigInteger.ONE);
    return sum;
  }
  
  public static BigInteger perimeter(BigInteger n) {
    return BigInteger.valueOf(4).multiply(fibo(n));
  }
}