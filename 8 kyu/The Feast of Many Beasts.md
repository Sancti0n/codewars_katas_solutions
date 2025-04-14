https://www.codewars.com/kata/5aa736a455f906981800360d

## JavaScript
```js
function feast(beast, dish) {
  return beast[0] == dish[0] && beast[beast.length-1] == dish[dish.length-1]
}
```

## Python
```python
def feast(beast, dish):
    return beast[0] == dish[0] and beast[len(beast)-1] == dish[len(dish)-1]
```

## PHP
```php
function feast($beast, $dish) {
  return $beast[0] == $dish[0] && $beast[strlen($beast)-1] == $dish[strlen($dish)-1];
}
```

## Java
```java
public class Kata {
  public static boolean feast(String beast, String dish) {
    return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
  }
}
```