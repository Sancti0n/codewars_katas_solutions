https://www.codewars.com/kata/5ac6932b2f317b96980000ca

## PHP
```php
function minValue($arr) {
  sort($arr);
  return intval(implode('', array_unique($arr)));
}
```

## Python
```python
def min_value(digits):
    d = list(set(digits))
    d.sort()
    return int(''.join(map(str,d)))
```

## JavaScript
```js
function minValue(v){
  return parseInt([...new Set(v)].sort().join(""))
}
```