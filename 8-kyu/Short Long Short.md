https://www.codewars.com/kata/50654ddff44f800200000007

## Python
```python
def solution(a, b):
    if len(a)>len(b): return b+a+b
    return a+b+a
```

## JavaScript
```js
function solution(a, b){
  return a.length>b.length ? b+a+b: a+b+a
}
```

## PHP
```php
function shortLongShort(string $a, string $b): string {
  if (strlen($a)>strlen($b)) return $b.$a.$b;
  return $a.$b.$a;
}
```

## Java
```java
public class ShortLongShort {
  public static String solution(String a, String b) {
    return a.length() < b.length() ? a+b+a:b+a+b;
  }
}
```