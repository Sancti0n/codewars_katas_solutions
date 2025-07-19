https://www.codewars.com/kata/542c0f198e077084c0000c2e

## Python
```python
def divisors(n):
    i, s = 1, 0
    while i<=n:
        if int(n/i) == n/i: s += 1
        i += 1
    return s
```

## PHP
```php
function divisors($n) {
  $i = 1; 
  $s = 0;
  while ($i<=$n) {
    if (intval($n/$i) == $n/$i) $s++;
    $i++;
  }
  return $s;
}
```

## JavaScript
```js
function getDivisorsCnt(n){
  let i = 1; 
  let s = 0;
  while (i<=n) {
    if (parseInt(n/i) == n/i) s++;
    i++;
  }
  return s
}
```

## Java
```java
public class FindDivisor {
  public long numberOfDivisors(int n) {
    int i = 1;
    int s = 0;
    while (i<=n) {
      if (n%i == 0) s++;
      i++;
    }
    return s;
  }
}
```