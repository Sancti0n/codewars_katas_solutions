https://www.codewars.com/kata/5704aea738428f4d30000914

## Python
```python
def triple_trouble(one, two, three):
    w = ""
    for i in range(len(one)):
        w += one[i]+two[i]+three[i]
    return w
```

## JavaScript
```js
function tripleTrouble(one, two, three){
  let w = "";
  for (let i=0;i<one.length;i++) {
    w += one[i]+two[i]+three[i];
  }
  return w
}
```

## Java
```java
public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    String w = "";
    for (int i=0;i<one.length();i++) {
      w += String.valueOf(one.charAt(i))+String.valueOf(two.charAt(i))+String.valueOf(three.charAt(i));
    }
    return w;
  }
}
```

## PHP
```php
function triple_trouble(string $one, string $two, string $three): string {
  $w = "";
  for ($i=0;$i<strlen($one);$i++) {
    $w .= $one[$i].$two[$i].$three[$i];
  }
  return $w;
}
```