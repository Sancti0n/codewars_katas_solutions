https://www.codewars.com/kata/563f0c54a22b9345bf000053

## Python
```python
def fcn (n):
    return 2**n
```

## JavaScript
```js
function fcn (n) {
  return 2**n
}
```

## PHP
```php
function fcn($n) {
  return 2**$n;
}
```

## Java
```java
import java.math.BigInteger;

class HiddenSeq {
  public static BigInteger fcn(int n) {
    BigInteger d = BigInteger.valueOf(2);
    return d.pow(n);
  }
}
```

## TypeScript
```ts
export function fcn(n: number): number {
  return 2**n;
}
```

## Ruby
```ruby
def fcn(n)
  return 2**n
end
```

## C#
```c#
using System;
using System.Numerics;

public class HiddenSeq {
  public static BigInteger fcn(int n) {
    BigInteger value = BigInteger.Pow(2, n);
    return value;
  }
}
```

## C
```c
unsigned long long fcn(int n) {
  return pow(2, n);
}
```