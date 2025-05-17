https://www.codewars.com/kata/570a6a46455d08ff8d001002

## Python
```python
def no_boring_zeros(n):
    if n == 0: return 0
    n = str(n)
    while n[len(n)-1] == "0":
        n = n[:len(n)-1]
    return int(n)
```

## JavaScript
```js
function noBoringZeros(n) {
  if (n == 0) return 0
  n = n.toString();
  while (n[n.length-1] == "0") n = n.slice(0, n.length-1);
  return parseInt(n)
}
```

## Java
```java
public class NoBoring {
  public static int noBoringZeros(int n) {
    if (n==0) return n;
    while (10*(n/10) == n) {
      n = n/10;
    }
    return n;
  }
}
```

## PHP
```php
function noBoringZeros(int $n): int {
  if ($n == 0) return 0;
  $n = strval($n);
  while ($n[strlen($n)-1] == "0") {
    $n = substr($n, 0, strlen($n)-1);
  }
  return intval($n);
}
```