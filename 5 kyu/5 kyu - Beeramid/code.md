Let's pretend your company just hired your friend from college and paid you a referral bonus. Awesome! To celebrate, you're taking your team out to the terrible dive bar next door and using the referral bonus to buy, and build, the largest three-dimensional beer can pyramid you can. And then probably drink those beers, because let's pretend it's Friday too.

A beer can pyramid will square the number of cans in each level - 1 can in the top level, 4 in the second, 9 in the next, 16, 25...

Complete the beeramid function to return the number of complete levels of a beer can pyramid you can make, given the parameters of:

    your referral bonus, and

    the price of a beer can

For example:

beeramid(1500, 2); // should === 12
beeramid(5000, 3); // should === 16

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