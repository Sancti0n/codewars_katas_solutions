https://www.codewars.com/kata/55f2b110f61eb01779000053

## JavaScript
```js
function getSum(a, b) {
  let sum = 0;
  let temp = 0;
  if (a>b) {
    temp = a;
    a = b;
    b = temp;
  }
  for (let i=a;i<=b;i++) {
    sum += i
  }
  return sum
}
```

## Python
```python
def get_sum(a,b):
    mini, maxi = min(a, b), max(a, b);
    return (maxi - mini + 1) * (mini + maxi)/ 2
```

## Java
```java
public class Sum {
  public int GetSum(int a, int b) {
    int min = Math.min(a,b);
    int max = Math.max(a,b);
    return (max-min+1)*(max+min)/2;
  }
}
```

## PHP
```php
function getSum(int $a, int $b): int{
  $sum = 0;
  $temp = 0;
  if ($a>$b) {
    $temp = $a;
    $a = $b;
    $b = $temp;
  }
  for ($i=$a;$i<=$b;$i++) {
    $sum += $i;
  }
  return $sum;
}
```