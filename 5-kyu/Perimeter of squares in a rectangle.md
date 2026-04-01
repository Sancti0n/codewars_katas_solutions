https://www.codewars.com/kata/559a28007caad2ac4e000083

## JavaScript
```js
function fibo(n) {
  let a = 1, b = 0, s = 0, sum = 0, i = 0;
  while (i<n) {
    s = a + b;
    sum += a + b;
    b = a;
    a = s;
    i++;
  }
  return sum+1
}

function perimeter(n) {
    return 4*fibo(n)
}
```

## Python
```python
def fibo(n):
    a, b, i, s, sum = [1,0,0,0,0]
    while i<n:
        s = a+b
        sum += s
        b = a
        a = s
        i += 1
    return sum+1

def perimeter(n):
    return 4*fibo(n)
```

## PHP
```php
function fibo($n) {
  $a = 1;
  $b = 0;
  $s = 0;
  $sum = 0;
  $i = 0;
  while ($i<$n) {
    $s = $a + $b;
    $sum += $a + $b;
    $b = $a;
    $a = $s;
    $i++;
  }
  return $sum+1;
}

function perimeter($n) {
    return 4*fibo($n);
}
```

## TypeScript
```ts
export const perimeter = (n:number):number => {
  let a = 1, b = 0, s = 0, sum = 0, i = 0;
  while (i<n) {
    s = a + b;
    sum += a + b;
    b = a;
    a = s;
    i++;
  }
  return 4*(sum+1)
}
```

## Java
```java
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
```