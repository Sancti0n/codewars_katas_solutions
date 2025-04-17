https://www.codewars.com/kata/52f3149496de55aded000410

## JavaScript
```js
function sumDigits(number) {
  let n = Array.from(String(Math.abs(number)), Number);
  return n.reduce((p,c)=>p+c, 0)
}
```

## Python
```python
def sum_digits(number):
    x = list(str(abs(number)))
    return sum([int(i) for i in x])
```

## PHP
```php
function sumDigits(int $number): int{
  $t = array_map('intval', str_split($number));
  return array_sum($t);
}
```