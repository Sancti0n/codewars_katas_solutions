https://www.codewars.com/kata/5d50e3914861a500121e1958

## Python
```python
import string

def add_letters(*letters):
    if letters == []: return 'z'
    t = list(string.ascii_lowercase)
    s = 0
    for i in letters: s += t.index(i)+1
    return t[(s-1)%26]
```

## PHP
```php
function addLetters(...$letters) {
  if ($letters == []) return 'z';
  $t = range('a', 'z');
  $s = 0;
  for ($i=0;$i<count($letters);$i++) $s += array_search($letters[$i], $t) + 1;
  return $t[($s-1)%26];
}
```

## JavaScript
```js
function addLetters(...letters) {
  if (letters.length == 0) return 'z'
  let t = String.fromCharCode(...Array(123).keys()).slice(97);
  let s = 0;
  for (let i=0;i<letters.length;i++) s += t.indexOf(letters[i]) + 1;
  return t[(s-1)%26]
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static String addLetters(String... letters) {
    if (letters.length == 0) return "z";
    String t[] = new String [26];
    char c;
    int a = 0;
    for(c='a';c<='z';++c) {
      t[a] = "" + c;
      a++;
    }
    int s = 0;
    for (int i=0;i<letters.length;i++) {
      s += Arrays.asList(t).indexOf(letters[i]) + 1;
    }
    return t[(s-1)%26];
  }
}
```