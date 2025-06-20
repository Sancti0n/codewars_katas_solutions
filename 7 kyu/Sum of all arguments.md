https://www.codewars.com/kata/540c33513b6532cd58000259

## Python
```python
def sum_args(*args):
    return sum(args)
```

## JavaScript
```js
function sum(...arg) {
  return arg.reduce((p, c) => p + c, 0)
}
```

## PHP
```php
function sum(...$arg) {
  return array_sum($arg);
}
```