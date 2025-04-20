https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097

## Python
```python
def century(year):
    if year < 100: return 1
    if year%100 == 0: return int(str(year)[0:len(str(year))-2])
    return int(str(year)[0:len(str(year))-2])+1
```

## PHP
```php
function centuryFromYear($year) {
  return intval(($year + 99) / 100);
}
```

## JavaScript
```js
function century(year) {
  return Math.floor((year+99)/100)
}
```

## Java
```java
public class Solution {
  public static int century(int number) {
    return (number+99)/100;
  }
}
```

## SQL
```sql
SELECT (yr+99)/100 AS century FROM years
```