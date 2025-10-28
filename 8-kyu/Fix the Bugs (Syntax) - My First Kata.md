https://www.codewars.com/kata/56aed32a154d33a1f3000018

## JavaScript
```js
function myFirstKata(a, b) {
  if (typeof(a) != "number" || typeof(b) != "number") return false;
  return a % b + b % a;
}
```

## Python
```python
def my_first_kata(a,b):
    if type(a) is not int or type(b) is not int:
        return False
    else:
        return a % b + b % a
```

## PHP
```php
function my_first_kata($a, $b) {
  if (!is_int($a) && !is_float($a) || (!is_int($b) && !is_float($b))) {
    return false;
  }
  return $a % $b + $b % $a;
}
```