https://www.codewars.com/kata/59c35ba16bddd219ee000082

## Python
```python
def perimeter(n):
    a,b,s,i = [1,0,0,0]
    while (i<n+1):
        s = a+b
        b = a
        a = s
        i+=1
    return (a+b)*2
```

## Java
```java
import java.math.BigInteger;

public class FibonacciRectangle {
  public static BigInteger perimeter(BigInteger n){
    BigInteger a = new BigInteger("1");
    BigInteger b = new BigInteger("0");
    BigInteger s = new BigInteger("0");
    for (int i=0;i<n.intValue()+1;i++) {
      s = a.add(b);
      b = a;
      a = s;
    }
    return a.add(b).multiply(BigInteger.valueOf(2));
  }
}
```

## JavaScript
```js
function perimeter(n) {
  let a = 1, b = 0, s = 0, i = 0;
  if (n>67) {
    a = BigInt(1);
    b = BigInt(0);
    s = BigInt(0);
  }
  while (i<=n) {
    s = a+b;
    b = a;
    a = s;
    i++;
  }
  if (n>67) return (a+b)*BigInt(2)
  return (a+b)*2
}
```