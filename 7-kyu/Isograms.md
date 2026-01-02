https://www.codewars.com/kata/54ba84be607a92aa900000f1

## Python
```py
def is_isogram(string):
    return len(string) == len(set(string.lower()))
```

## JavaScript
```js
function isIsogram(str){
  return str.length === [...new Set(str.toLowerCase())].length
}
```

## PHP
```php
function isIsogram($string) {
  if ($string == "") return true;
  return strlen($string) == count(array_unique(str_split(strtolower($string))));
}
```

## Java
```java
public class isogram {
  public static boolean  isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  } 
}
```