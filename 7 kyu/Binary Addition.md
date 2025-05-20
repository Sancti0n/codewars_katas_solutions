https://www.codewars.com/kata/551f37452ff852b7bd000139

## Python
```python
def add_binary(a,b):
    return format(a+b, "b")
```

## JavaScript
```js
function addBinary(a,b) {
  return (a+b).toString(2)
}
```

## Java
```java
public class Kata{
  public static String binaryAddition(int a, int b){
    return Integer.toBinaryString(a+b);
  }
}
```

## PHP
```php
function add_binary($a, $b) {
  return decbin($a+$b);
}
```