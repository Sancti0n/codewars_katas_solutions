https://www.codewars.com/kata/56b7f2f3f18876033f000307

## JavaScript
```js
function inAscOrder(arr) {
  let v = arr[0]
  for (let i=1;i<arr.length;i++) {
    if (v>arr[i]) return false
    else v = arr[i]
  }
  return true
}
```

## Python
```python
def in_asc_order(arr):
    b = arr.copy()
    b.sort()
    return b == arr
```

## PHP
```php
function in_asc_order($arr) {
  $a = $arr;
  sort($a);
  return $a == $arr;
}
```