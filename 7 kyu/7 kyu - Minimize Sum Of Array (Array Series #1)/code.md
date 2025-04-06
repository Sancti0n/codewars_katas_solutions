Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .


## JavaScript
```js
function minSum(arr) {
  let s = 0;
  while (arr.length>0) {
    s += Math.max(...arr)*Math.min(...arr);
    arr.splice(arr.indexOf(Math.max(...arr)), 1);
    arr.splice(arr.indexOf(Math.min(...arr)), 1);
  }
  return s
}
```

## Python
```python
def min_sum(arr):
    s = 0
    while len(arr)>0:
        s += max(arr)*min(arr)
        arr.remove(max(arr))
        arr.remove(min(arr))
    return s
```

## PHP
```php
function minSum($arr) {
  $s = 0;
  sort($arr);
  while (count($arr)>0) {
    $s += $arr[count($arr)-1]*$arr[0];
    array_shift($arr);
    array_pop($arr);
  }
  return $s;
}
```