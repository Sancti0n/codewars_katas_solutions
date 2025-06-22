https://www.codewars.com/kata/58d3487a643a3f6aa20000ff

## Python
```python
def min_min_max(arr):
    v = min(arr)
    while v in arr: v += 1
    return [min(arr), v, max(arr)]
```

## JavaScript
```js
function minMinMax(array) {
  let v = Math.min(...array);
  while (array.indexOf(v)>-1) v++;
  return [Math.min(...array), v, Math.max(...array)]
}
```

## PHP
```php
function minMinMax($array) {
  $v = min($array);
  while (in_array($v, $array)) $v++;
  return [min($array), $v, max($array)];
}
```