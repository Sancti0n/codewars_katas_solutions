https://www.codewars.com/kata/55b1e5c4cbe09e46b3000034

## Python
```python
def is_pronic(n):
    p = int(abs(n)**0.5)
    return p*(p+1) == n or p*(p-1) == n
```

## JavaScript
```js
function isPronic(n) {
  let p = parseInt(Math.abs(n)**0.5);
  return p*(p+1) == n || p*(p-1) == n
}
```

## Java
```java
public class Pronic {
  public static boolean isPronic(int n) {
    int p = (int) Math.pow(Math.abs(n),0.5);
    return p*(p+1) == n || p*(p-1) == n;
	}
}
```

## PHP
```php
function isPronic(int $n): bool{
  $p = intval(abs($n)**0.5);
  return $p*($p+1) == $n || $p*($p-1) == $n;
}
```