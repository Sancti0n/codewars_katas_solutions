https://www.codewars.com/kata/5641a03210e973055a00000d

## JavaScript
```js
function twoDecimalPlaces(n) {
  return parseFloat(n.toFixed(2))
}
```

## Python
```python
def two_decimal_places(n):
    return round(n,2)
```

## PHP
```php
function twoDecimalPlaces($n) {
  return round($n,2);
}
```

## Java
```java
public class Numbers {
  public static double TwoDecimalPlaces(double n) {
    return Math.round(n * 100.0) / 100.0;
  }
}
```