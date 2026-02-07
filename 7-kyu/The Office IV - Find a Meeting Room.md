https://www.codewars.com/kata/57f604a21bd4fe771b00009c

## JavaScript
```js
function meeting(x) {
  return x.indexOf("O")>-1 ? x.indexOf("O") : "None available!"
}
```

## Python
```py
def meeting(rooms):
    return "None available!" if "O" not in rooms else rooms.index("O")
```

## PHP
```php
function meeting($a) {
  return array_search('O', $a) === false ? "None available!" : array_search('O', $a);
}
```

## Java
```java
public class TheOffice {
  public static Object meeting(char[] x) {
    int index = new String(x).indexOf("O");
    return index>-1 ? index : "None available!";
  }
}
```