https://www.codewars.com/kata/59a96d71dbe3b06c0200009c

## Python
```python
def generate_shape(n):
    w = ""
    for i in range(n):
        w += str("+"*n)+"\n"
    return w[0:len(w)-1]
```

## JavaScript
```js
function generateShape(integer){
  let w = "";
  for (let i=0;i<integer;i++) {
    w += "+".repeat(integer)+"\n";
  }
  return w.substring(0, w.length-1)
}
```

## PHP
```php
function generateShape($int) {
  $w = "";
  for ($i=0;$i<$int;$i++) {
    $w .= "+".str_repeat("+", $int-1)."\n";
  }
  return substr($w, 0, strlen($w)-1);
}
```

## Java
```java
public class Kata {
  public static final String generateShape(int n) {
    String w = "";
    for (int i=0;i<n;i++) {
      w += "+".repeat(n) + "\n";
    }
    return w.substring(0, w.length()-1);
  }
}
```