https://www.codewars.com/kata/526c7363236867513f0005ca

## JavaScript
```js
function isLeapYear(year) {
  return year%4 == 0 && year%100 != 0 || year%400 == 0
}
```

## Python
```python
def isLeapYear(year):
    return year%4 == 0 and year%100 != 0 or year%400 == 0
```

## PHP
```php
function isLeapYear($year) {
  return $year%4 == 0 && $year%100 != 0 || $year%400 == 0;
}
```

## Java
```java
public class LeapYears {
    public static boolean isLeapYear(int year) {
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
    }
}
```