https://www.codewars.com/kata/58f6f87a55d759439b000073

## Python
```python
def negation_value(s, val):
    return not val if len(s)%2 else bool(val)
```

## JavaScript
```js
function negationValue(s, value) {
  return s.length%2 ? !value: Boolean(value)
}
```

## PHP
```php
function negationValue($str, $val) {
  return strlen($str)%2 ? !$val : boolval($val);
}
```