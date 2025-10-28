https://www.codewars.com/kata/56d3e702fc231fdf72001779

## JavaScript
```js
const sxore = function(n){
  return [n, 1, n+1, 0][n%4]
}
```

## Python
```python
def sxore(n):
    return [n, 1, n+1, 0][n%4]
```

## PHP
```php
function sxore(int $n): int {
  return [$n, 1, $n+1, 0][$n%4];
}
```

## Java
```java
import java.math.BigInteger;

public class BinarySxore {
  public static BigInteger sxore (BigInteger n) {
    BigInteger[] t = new BigInteger[4];
    BigInteger modulo = new BigInteger("4");
    t[3] = BigInteger.ZERO;
    t[1] = BigInteger.ONE;
    t[0] = n;
    t[2] = n.add(BigInteger.ONE);
    return t[n.mod(modulo).intValue()];
  }
}
```

## TypeScript
```ts
export const sxore = function(n: number): number {
  return [n, 1, n+1, 0][n%4]
}
```