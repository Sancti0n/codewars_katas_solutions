https://www.codewars.com/kata/51edd51599a189fe7f000015

## Python
```python
def solution(a, b):
    s = 0
    for i in range(len(a)):
        s += abs(b[i]-a[i])**2
    return s/len(a)
```

## JavaScript
```js
var solution = function(a, b) {
  s = 0;
  for (let i=0;i<a.length;i++) {
    s += Math.abs(b[i]-a[i])**2;
  }
  return s/a.length
}
```

## PHP
```php
function solution(array $a, array $b): float {
  $s = 0;
  for ($i=0;$i<count($a);$i++) {
    $s += pow(abs($b[$i]-$a[$i]),2);
  }
  return $s/count($a);
}
```

## Java
```java
public class Solution {
  public static double solution(int[] a, int[] b) {
    double s = 0;
    for (int i=0;i<a.length;i++) {
      s += Math.pow(Math.abs(b[i]-a[i]),2);
    }
    return s/a.length;
  }
}
```