https://www.codewars.com/kata/55cbd4ba903825f7970000f5

## Python
```python
def get_grade(s1, s2, s3):
    s = int((s1+s2+s3)/3)
    if s>=90: return "A"
    if s>=80: return "B"
    if s>=70: return "C"
    if s>=60: return "D"
    return "F"
```

## PHP
```php
function getGrade($a, $b, $c) {
  $s = intval(($a+$b+$c)/3);
  if ($s>=90) return "A";
  if ($s>=80) return "B";
  if ($s>=70) return "C";
  if ($s>=60) return "D";
  return "F";
}
```

## JavaScript
```js
function getGrade (s1, s2, s3) {
  let s = parseInt((s1+s2+s3)/3)
  if (s>=90) return "A"
  if (s>=80) return "B"
  if (s>=70) return "C"
  if (s>=60) return "D"
  return "F"
}
```

## Java
```java
public class GrassHopper {
  public static char getGrade(int s1, int s2, int s3) {
    int s = (s1+s2+s3)/3;
    if (s>=90) return 'A';
    if (s>=80) return 'B';
    if (s>=70) return 'C';
    if (s>=60) return 'D';
    return 'F';
  }
}
```