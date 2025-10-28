https://www.codewars.com/kata/596c6eb85b0f515834000049

## Python
```python
import re
def replace_dots(str):
    return re.sub(r"\.", "-", str)
```

## PHP
```php
function replace_dots(string $str): string {
  return preg_replace('/\./', '-', $str);
}
```

## JavaScript
```js
var replaceDots = function(str) {
  return str.replace(/\./g, "-")
}
```

## Java
```java
public class Dinglemouse {
  public static String replaceDots(final String str) {
    return str.replaceAll("\\.", "-");
  }
}
```