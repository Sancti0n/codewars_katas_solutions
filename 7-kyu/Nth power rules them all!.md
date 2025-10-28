https://www.codewars.com/kata/58aed2cafab8faca1d000e20

## Python
```python
def modified_sum(a, n):
    somme = 0
    for i in a:
        somme += int(i)**n
    return somme - sum(a)
```

## JavaScript
```js
function modifiedSum(a, n) {
  let s = 0;
  for (let i=0;i<a.length;i++) s += a[i]**n;
  return s - a.reduce((p, c) => p + c, 0)
}
```

## PHP
```php
function modified_sum(array $a, int $n): int {
  $s = 0;
  for ($i=0;$i<count($a);$i++) $s += $a[$i]**$n;
  return $s - array_sum($a);
}
```

## Java
```java
public class Kata {
  public static int modifiedSum(int[] arr, int n) {
    int s = 0;
    int sum = 0;
    for (int i=0;i<arr.length;i++) {
      s += Math.pow(arr[i],n);
      sum += arr[i];
    }
    return s - sum;
  }
}
```