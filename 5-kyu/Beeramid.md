https://www.codewars.com/kata/51e04f6b544cf3f6550000c1

## JavaScript
```js
function beeramid(bonus, price) {
  let n = 1;
  let s = n*(n+1)*(2*n+1)/6;
  let a = Math.trunc(bonus/price);
  while (s<=a) {
    s = n*(n+1)*(2*n+1)/6;
    n++;
  }
  return n<=2 ? 0: n-2
}
```

## Python
```python
def beeramid(bonus, price):
    n = 1
    s = n*(n+1)*(2*n+1)/6
    a = int(bonus/price)
    while s<=a:
        s = n*(n+1)*(2*n+1)/6
        n += 1
    return 0 if n<=2 else n-2
```

## PHP
```php
function beeramid($bonus, $price) {
  $n = 1;
  $s = $n*($n+1)*(2*$n+1)/6;
  $a = $bonus/$price;
  while ($s<=$a) {
    $s = $n*($n+1)*(2*$n+1)/6;
    $n++;
  }
  return $n<=2 ? 0: $n-2;
}
```