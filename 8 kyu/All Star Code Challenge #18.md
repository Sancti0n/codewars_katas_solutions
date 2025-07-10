https://www.codewars.com/kata/5865918c6b569962950002a1

## Python
```python
def str_count(strng, letter):
    return strng.count(letter)
```

## JavaScript
```js
function strCount(str, letter){
  return (str.match(new RegExp(letter, "g")) || []).length
}
```

## PHP
```php
function strCount($str, $letter) {
  return substr_count($str, $letter);
}
```

## Java
```java
public class CodeWars {
  public static int strCount(String str, char letter) {
    return str.length() - str.replace(String.valueOf(letter), "").length();
  }
}
```