https://www.codewars.com/kata/56f6ad906b88de513f000d96

## Python
```python
def bonus_time(salary, bonus):
    if bonus: return '$'+str(salary*10)
    return '$'+str(salary)
```

## JavaScript
```js
function bonusTime(salary, bonus) {
  if (bonus) return '£'+(salary*10).toString()
  return '£'+salary.toString()
}
```

## PHP
```php
function bonusTime($salary, $bonus) {
  if ($bonus) return '$'.intval($salary*10);
  return '$'.intval($salary);
}
```

## Java
```java
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    if (bonus) return String.valueOf("£"+(salary*10));
    return String.valueOf("£"+salary);
  }
}
```