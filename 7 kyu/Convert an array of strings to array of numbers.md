https://www.codewars.com/kata/5783d8f3202c0e486c001d23

## Python
```python
def to_float_array(arr):
    return [float(x) for x in arr]
```

## JavaScript
```js
function toNumberArray(s) {
  return s.map(Number)
}
```

## PHP
```php
function toNumberArray(array $s) : array {
  return array_map('floatval', $s);
}
```