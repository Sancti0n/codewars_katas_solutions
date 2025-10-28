https://www.codewars.com/kata/5541f58a944b85ce6d00006a

## Python
```python
def productFib(prod):
    t = [0,1]
    while prod>=t[len(t)-2]*t[len(t)-1]:
        if prod == t[len(t)-2]*t[len(t)-1]: return [t[len(t)-2],t[len(t)-1], True]
        t.append(t[len(t)-2]+t[len(t)-1])
    return [t[len(t)-2],t[len(t)-1], False]
```

## JavaScript
```js
function productFib(prod) {
  let a = 0, b = 1, m = 0;
  while (prod > a * b) {
    m = a, a = b, b = m + b;
  }
  return [a, b, prod == a * b]
}
```

## PHP
```php
function productFib($prod) {
  $a = 0;
  $b = 1;
  $m = 0;
  while ($prod > $a * $b) {
    $m = $a;
    $a = $b;
    $b = $m + $b;
  }
  return [$a, $b, $prod == $a * $b];
}
```

## Java
```java
public class ProdFib {
	
	public static long[] productFib(long prod) {
    long a= 0;
    long b = 1;
    long m = 0;
    int bool = 0;
    while (prod > a * b) {
      m = a;
      a = b;
      b = m + b;
    }
    if (prod == a*b) bool = 1;
    return new long[] {a, b, bool};
  }
}
```