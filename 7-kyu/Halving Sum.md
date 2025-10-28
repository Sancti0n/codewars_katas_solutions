https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d

## Python
```python
def halving_sum(n): 
    somme, i = n, 2
    while n/i*2>=1:
        somme += n//i
        i *= 2
    return somme
```

## PHP
```php
function halvingSum($n) {
  $s = $n;
  $i = 2;
  while ($n/$i*2 >= 1) {
    $s += floor($n/$i);
    $i *= 2;
  }
  return intval($s);
}
```

## JavaScript
```js
function halvingSum(n) {
  let s = n;
  let i = 2;
  while (n/i*2 >= 1) {
    s += Math.trunc(n/i);
    i *= 2;
  }
  return s
}
```

## Java
```java
public class HalvingSum {
  int halvingSum(int n) {
    int s = n;
    int i = 2;
    while (n/i*2 >= 1) {
      s += n/i;
      i *= 2;
    }
    return s;
  }
}
```