https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd

## JavaScript
```js
function mygcd(x,y) {
  if (y === 0) return x
  return mygcd(y, x%y)
}
```

## Python
```python
def mygcd(x, y):
    if y == 0: return x
    return mygcd(y, x%y)
```

## PHP
```php
function mygcd($x, $y) {
  if ($y == 0) return $x;
  return mygcd($y, $x%$y);
}
```

## Java
```java
public class GCD {
  public static int compute(int x, int y) {
    if (y == 0) return x;
    return compute(y, x%y);
  }
}
```