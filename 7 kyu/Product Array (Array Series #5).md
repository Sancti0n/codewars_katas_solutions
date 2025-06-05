https://www.codewars.com/kata/5a905c2157c562994900009d

## Python
```python
import math

def product_array(numbers):
    t = []
    for i in range(len(numbers)):
        if numbers[i] != 0: t.append(math.prod(numbers)/numbers[i])
        else: t.append(math.prod(numbers))
    return t
```

## JavaScript
```js
function productArray(numbers){
  let t = [];
  for (let i=0;i<numbers.length;i++) {
    if (numbers[i] != 0) t.push(numbers.reduce((a, b)=> a*b, 1)/numbers[i]);
    else t.push(numbers.reduce((a, b)=> a*b, 1));
  }
  return t
}
```

## PHP
```php
function productArray($nums) {
  $t = [];
  for ($i=0;$i<count($nums);$i++) {
    if ($nums[$i] != 0) $t[] = array_product($nums)/$nums[$i];
    else $t[] = array_product($nums);
  }
  return $t;
}
```