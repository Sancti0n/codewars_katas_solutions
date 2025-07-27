https://www.codewars.com/kata/5262119038c0985a5b00029f

## Python
```python
import math
def is_prime(num):
    if num<2: return False
    if num == 2 or num == 3: return True
    if num>2 and num%2 == 0: return False
    i = 2
    while i<int(math.sqrt(num))+1:
        if num%i == 0: return False
        i += 1
    return True
```

## JavaScript
```js
function isPrime(n) {
  if (n<2 || n>2 && n%2 == 0) return false
  if (n == 2 || n == 3) return true
  let i = 2;
  while (i<parseInt(Math.sqrt(n))+1) {
    if (n%i == 0) return false
    i++;
  }
  return true
}
```

## PHP
```php
function is_prime(int $n): bool {
  if ($n<2 || $n>2 && $n%2 == 0) return false;
  if ($n == 2 || $n == 3) return true;
  $i = 2;
  while ($i<intval(sqrt($n))+1) {
    if ($n%$i == 0) return false;
    $i++;
  }
  return true;
}
```