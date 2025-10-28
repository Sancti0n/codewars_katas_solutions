https://www.codewars.com/kata/54ff3102c1bad923760001f3

## JavaScript
```js
function getCount(str) {
  var v = 0;
  let t = ['a','e','i','o','u'];
  for (let i=0;i<str.length;i++) {
    if (t.indexOf(str[i])>-1) v++;
  }
  return v;
}
```

## Python
```python
def get_count(s):
    v = 0
    t = ['a','e','i','o','u']
    for i in range(len(s)):
        if s[i] in t: v += 1
    return v
```

## PHP
```php
function getCount($str) {
  $v = 0;
  $t = ['a','e','i','o','u'];
  for ($i=0;$i<strlen($str);$i++) {
    if (in_array($str[$i], $t)) $v++;
  }
  return $v;
}
```

## Java
```java
public class Vowels {

  public static int getCount(String str) {
    String[] t = {"a","e","i","o","u"};
    int c = 0;
    for (int i=0;i<str.length();i++) {
      for (int j=0;j<t.length;j++) {
        if (String.valueOf(str.charAt(i)).equals(t[j])) {
          c++;
          break;
        }
      }
    }
    return c;
  }
}
```