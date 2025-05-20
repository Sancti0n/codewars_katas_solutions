https://www.codewars.com/kata/5839edaa6754d6fec10000a2

## Python
```python
import string

def find_missing_letter(chars):
    if chars[0].islower():
        l = list(string.ascii_lowercase)
        i = l.index(chars[0])
        for j in range(len(chars)):
            if chars[j] != l[j+i]: return l[j+i]
    else:
        L = list(string.ascii_uppercase)
        i = L.index(chars[0])
        for j in range(len(chars)):
            if chars[j] != L[j+i]: return L[j+i]
```

## PHP
```php
function find_missing_letter(array $array): string {
  $v = ord($array[0]);
  for ($i=0;$i<count($array);$i++) {
    if (ord($array[$i]) != $v) return chr($v);
    $v++;
  }
}
```

## JavaScript
```js
function findMissingLetter(array) {
  let v = array.join("").charCodeAt(0);
  for (let i=0;i<array.length;i++) {
    if (array.join("").charCodeAt(i) != v) return String.fromCharCode(v)
    v++;
  }
}
```

## Java
```java
public class Kata {
  public static char findMissingLetter(char[] array) {
    int c = (int) array[0];
    for (int i=0;i<array.length;i++) {
      if ((int) array[i] != c) return (char) c;
      c++;
    }
    return ' ';
  }
}
```