https://www.codewars.com/kata/58dabca7ce77a12dbd00000f

## PHP
```php
function solution(int $n): int {
  if ($n%2 == 1) return 1;
  $i = 0;
  while ($n%2 == 0) {
    $i++;
    $n /= 2;
  }
  return 2**$i;
}
```