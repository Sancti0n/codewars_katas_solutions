https://www.codewars.com/kata/5ae7e3f068e6445bc8000046

## Python
```python
def next_happy_year(year):
    year = year + 1
    while len(set(str(year))) != 4:
        year += 1
    return year
```

## JavaScript
```js
function nextHappyYear(year){
  year++;
  while ([...new Set(year.toString())].length != 4) year++;
  return year
}
```

## PHP
```php
function nextHappyYear($year) {
  $year++;
  while (count(array_unique(str_split($year))) != 4) {
    $year++;
  }
  return $year;
}
```

## Java
```java
public class HappyYear {
  static public int countOcc(int a) {
    int c = 0;
    String s = String.valueOf(a);
    for (int i=0;i<s.length();i++) {
      String v = String.valueOf(s.charAt(i));
      if (s.length()-s.replace(v, "").length() == 1) {
        c++;
      }
    }
    return c;
  }
  
  static public int nextHappyYear(int year) {
    year++;
    while (countOcc(year) != 4) {
      year++;
    }
    return year;
  }
}
```