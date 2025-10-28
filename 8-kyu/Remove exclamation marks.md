https://www.codewars.com/kata/57a0885cbb9944e24c00008e

## Python
```python
def remove_exclamation_marks(s):
    return s.replace('!', '')
```

## PHP
```php
function remove_exclamation_marks($string) {
  return str_replace("!", "", $string);
}
```

## JavaScript
```js
function removeExclamationMarks(s) {
  return s.replace(/!/g, "")
}
```

## Java
```java
class Solution {
  static String removeExclamationMarks(String s) {
    return s.replaceAll("!", "");
  }
}
```