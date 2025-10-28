https://www.codewars.com/kata/5803956ddb07c5c74200144e

## Python
```python
def dating_range(age):
    if age<=14:
        min = int(age*0.9)
        max = int(age*1.1)
        return str(min)+"-"+str(max)
    min = 7 + int(age/2)
    max = (age-7)*2
    return str(min)+"-"+str(max) 
```

## JavaScript
```js
function datingRange(age){
  if (age<=14) {
    let min = parseInt(age*0.9);
    let max = parseInt(age*1.1);
    return min.toString()+"-"+max.toString()
  }
  let min = 7 + parseInt(age/2);
  let max = (age-7)*2;
  return min.toString()+"-"+max.toString()
}
```

## PHP
```php
function datingRange($age) {
  if ($age<=14) {
    $min = intval($age*0.9);
    $max = intval($age*1.1);
    return strval($min)."-".strval($max);
  }
  $min = 7 + intval($age/2);
  $max = ($age-7)*2;
  return strval($min)."-".strval($max);
}
```

## Java
```java
public class Kata{
  public static String datingRange(int age) {
    if (age<=14) return String.valueOf(age*9/10)+"-"+String.valueOf(age*11/10);
    return String.valueOf(7 + age/2)+"-"+String.valueOf((age-7)*2);
  }
}
```