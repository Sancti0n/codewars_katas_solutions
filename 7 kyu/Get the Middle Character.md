https://www.codewars.com/kata/56747fd5cb988479af000028

## Python
```python
def get_middle(s):
    l = len(s)
    if l%2 == 0: return s[int((l/2)-1)] + s[int(l/2)]
    else:
        if l == 1: return s
        else: return s[int(l/2)]
```

## PHP
```php
function getMiddle($s) {
  $l = strlen($s);
  if ($l%2 == 0) return $s[intval(($l/2)-1)].$s[intval($l/2)];
  else {
    if ($l == 1) return $s;
    else return $s[intval($l/2)];
  }
}
```

## JavaScript
```js
function getMiddle(s) {
  let l = s.length;
  if (l%2 === 0) return s[parseInt((l/2)-1)] + s[parseInt(l/2)]
  if (l === 1) return s
  return s[parseInt(l/2)]
}
```

## Java
```java
class Kata {
  public static String getMiddle(String word) {
    int l = word.length();
    if (l%2 == 0) {
      return String.valueOf(word.charAt(l/2 - 1)) + String.valueOf(word.charAt(l/2));
    }
    else {
      if (l==1) return word;
      else return String.valueOf(word.charAt(l/2));
    }
  }
}
```