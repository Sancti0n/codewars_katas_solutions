https://www.codewars.com/kata/55908aad6620c066bc00002a

## Python
```python
def xo(s):
    s = list(s.lower())
    return s.count('o') == s.count('x')
```

## JavaScript
```js
function XO(str) {
  str = str.toLowerCase().split('')
  return str.filter(v => v === 'o').length === str.filter(v => v === 'x').length
}
```

## PHP
```php
function XO($s) {
  $s = strtolower($s);
  return substr_count($s,'x') == substr_count($s,'o');
}
```

## Java
```java
public class XO {
  public static boolean getXO (String str) {
    str = str.toLowerCase();
    return str.length() - str.replace("o", "").length() == str.length() - str.replace("x", "").length();
  }
}
```