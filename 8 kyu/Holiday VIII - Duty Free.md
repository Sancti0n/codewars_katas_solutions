https://www.codewars.com/kata/57e92e91b63b6cbac20001e5

## Python
```python
def duty_free(price, discount, holiday_cost):
    return int(holiday_cost/(price*(discount/100)))
```

## PHP
```php
function dutyFree($price, $discount, $hol) {
  return intval($hol/($price*($discount/100)));
}
```

## JavaScript
```js
function dutyFree(price, discount, hol){
  return parseInt(hol/(price*(discount/100)))
}
```

## Java
```java
public class Kata {
  public static int dutyFree(int price, int discount, int hol) {
    return 100*hol/(price*discount);
  }
}
```