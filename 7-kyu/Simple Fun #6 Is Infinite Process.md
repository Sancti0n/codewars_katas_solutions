https://www.codewars.com/kata/588431bb76933b84520000d3

## Python
```python
def is_infinite_process(a, b):
    return False if (a+b)%2 == 0 and a<=b else True
```

## JavaScript
```js
function isInfiniteProcess(a, b) {
  return a>b || (b-a)%2 == 1
}
```

## PHP
```php
function is_infinite_process(int $a, int $b): bool {
  return $a>$b || ($b-$a)%2 == 1;
}
```