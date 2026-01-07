https://www.codewars.com/kata/556deca17c58da83c00002db

## JavaScript
```js
function tribonacci(s,n){
  if (s.length>n) return s.slice(0,n)
  for (let i=s.length;i<n;i++) {
    s.push(
      s[s.length-1]
      +s[s.length-2]
      +s[s.length-3]
    )
  }
  return s
}
```

## Python
```python
def tribonacci(s, n):
    if len(s)>n: return s[:n]
    i = len(s)
    while i<n:
        s.append(
          s[len(s)-1]
          +s[len(s)-2]
          +s[len(s)-3]
        )
        i += 1
    return s
```

## PHP
```php
function tribonacci($s, $n) {
  if (count($s)>$n) return array_slice($s,0,$n);
  for ($i=count($s);$i<$n;$i++) {
    $s[] = $s[count($s)-1]
          +$s[count($s)-2]
          +$s[count($s)-3];
  }
  return $s;
}
```

## Java
```java
import java.util.Arrays;

public class Xbonacci {
  public double[] tribonacci(double[] s, int n) {
    if (s.length>n) return Arrays.copyOfRange(s,0,n);
    double[] t = new double[n];
    for (int i=0;i<s.length;i++) {
      t[i] = s[i];
    }
    for (int j=s.length;j<n;j++) {
      t[j] = t[j-1]+t[j-2]+t[j-3];
    }
    return t;
  }
}
```