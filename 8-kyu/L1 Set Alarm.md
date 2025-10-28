https://www.codewars.com/kata/568dcc3c7f12767a62000038

## Python
```python
def set_alarm(employed, vacation):
    return employed and not vacation
```

## JavaScript
```js
function setAlarm(employed, vacation){
  return employed && !vacation
}
```

## PHP
```php
function setAlarm(bool $employed, bool $vacation): bool {
  return $employed && !$vacation;
}
```

## Java
```java
public class Alarm {
  public static boolean setAlarm(boolean employed, boolean vacation) {
    return employed && !vacation;
  }
}
```