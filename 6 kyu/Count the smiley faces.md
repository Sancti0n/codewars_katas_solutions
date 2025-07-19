https://www.codewars.com/kata/583203e6eb35d7980400002a

## Python
```python
def count_smileys(arr):
    t = [':)', ':D', ';)', ';D', ';-D', ':~)', ';~)', ';~D', ':-)', ':-D']
    s = 0
    for i in arr:
        if i in t: s += 1
    return s
```

## JavaScript
```js
function countSmileys(arr) {
  let t = [':)', ':D', ';)', ';D', ';-D', ':~)', ';~)', ';~D', ':-)', ':-D', ";-)", ":~D"];
  let s = 0;
  for (let i=0;i<arr.length;i++) if (t.indexOf(arr[i])>-1) s += 1;
  return s
}
```

## PHP
```php
function count_smileys($arr): int {
  $t = [':)', ':D', ';)', ';D', ';-D', ':~)', ';~)', ';~D', ':-)', ':-D', ";-)", ":~D"];
  $s = 0;
  for ($i=0;$i<count($arr);$i++) if (in_array($arr[$i], $t)) $s++;
  return $s;
}
```

## Java
```java
import java.util.*;

public class SmileFaces {
  public static int countSmileys(List<String> arr) {
    String t[] = {":)", ":D", ";)", ";D", ";-D", ":~)", ";~)", ";~D", ":-)", ":-D", ";-)", ":~D"};
    List<String> L = new ArrayList<>(Arrays.asList(t));
    int s = 0;
    for (int i=0;i<arr.size();i++) if (L.contains(arr.get(i))) {s += 1;}
    return s;
  }
}
```