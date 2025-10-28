https://www.codewars.com/kata/5d9f95424a336600278a9632

## Python
```python
import math

def powers(n):
    t = []
    i = int(math.log2(n))
    while i>=0:
        if 2**i<=n:
            t.insert(0,2**i)
            n -= 2**i
        i -= 1
    return t
```

## JavaScript
```js
const powers = n => {
  let t = [];
  let i = parseInt(Math.log2(n));
  while (i>=0) {
    if (2**i<=n) {
      t.unshift(2**i);
      n -= 2**i;
    }
    i--;
  }
  return t
};
```

## PHP
```php
function powers($n) {
  $t = [];
  $i = intval(log($n, 2));
  while ($i>=0) {
    if (2**$i<=$n) {
      array_unshift($t , 2**$i);
      $n -= 2**$i;
    }
    $i--;
  }
  print_r($t);
  return $t;
}
```