https://www.codewars.com/kata/5a63948acadebff56f000018

## PHP
```php
function maxProduct($arr, $size) {
  rsort($arr);
  $s = 1;
  for ($i=0;$i<$size;$i++) {
    $s *= $arr[$i];
  }
  return $s;
}
```

## Python
```python
import math

def max_product(lst, n):
    lst.sort(reverse=True)
    return math.prod(lst[:n])
```

## JavaScript
```js
function maxProduct(numbers, size) {
  numbers.sort((a,b)=>b-a);
  let s = 1;
  for (let i=0;i<size;i++) {
    s *= numbers[i];
  }
  return s
}
```