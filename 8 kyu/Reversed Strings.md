https://www.codewars.com/kata/5168bb5dfe9a00b126000018

## JavaScript
```js
function solution(str){
    return str.split('').reverse().join('')
}
```

## Python
```python
def solution(string):
    return string[::-1]
```

## PHP
```php
function solution($str) {
  return strrev($str);
}
```

## Java
```java
import java.util.Collections;
import java.util.Arrays;

public class Kata {
  public static String solution(String str) {
    String s[] = str.split("");
    Collections.reverse(Arrays.asList(s));
    Arrays.asList(s);
    return String.join("", s);
  }
}
```