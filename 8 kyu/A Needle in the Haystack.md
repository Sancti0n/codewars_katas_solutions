https://www.codewars.com/kata/56676e8fabd2d1ff3000000c

## Python
```python
def find_needle(haystack):
    return 'found the needle at position '+ str(haystack.index('needle'))
```

## JavaScript
```js
function findNeedle(haystack) {
  return 'found the needle at position '+(haystack.indexOf('needle')).toString()
}
```

## PHP
```php
function findNeedle($haystack) {
  return "found the needle at position ".array_search("needle", $haystack);
}
```

## Java
```java
public class Kata {
  public static String findNeedle(Object[] haystack) {
    for (int i=0;i<haystack.length;i++) {
      if (String.valueOf(haystack[i]).equals("needle")) return "found the needle at position "+String.valueOf(i);
    }
    return "false";
  }
}
```