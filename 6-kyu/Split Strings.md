https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

## Python
```python
def solution(s):
    t = []
    i = 0
    while i<len(s):
        t.append(s[i:i+2])
        i += 2
    if len(s)%2: t[-1] = t[-1] + '_'
    return t
```

## JavaScript
```js
function solution(str){
  if (!str) return []
  let t = str.match(/.{1,2}/g);
  if (t[t.length-1].length<2) t[t.length-1] += "_";
  return t
}
```

## PHP
```php
function solution($str) {
  if (strlen($str) == 0) return [];
  $t = str_split($str, 2);
  if (strlen($str)%2 == 1) $t[count($t)-1] .= "_";
  return $t;
}
```

## Java
```java
public class StringSplit {
  public static String[] solution(String s) {
    if (s.length() == 0) return new String[] {};
    String[] st = s.split("(?<=\\G..)");
    if (s.length()%2 == 1) st[st.length-1] += "_";
    return st;
  }
}
```