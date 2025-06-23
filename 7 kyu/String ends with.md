https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d

## JavaScript
```js
function solution(s, ending){
  return s.slice(s.length-ending.length) === ending
}
```

## Python
```python
def solution(string, ending):
    return string[len(string)-len(ending):] == ending
```

## PHP
```php
function solution($str, $ending) {
  return substr($str, strlen($str)-strlen($ending)) == $ending;
}
```

## Java
```java
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}
```