https://www.codewars.com/kata/5864eb8039c5ab9cd400005c

## JavaScript
```js
function median(array) {
  array.sort((a,b)=>a-b);
  let v = array[parseInt(array.length/2)];
  return array.length%2 ? v : (array[parseInt(array.length/2)-1] + v)/2
}
```

## Python
```python
def median(arr):
    arr.sort(reverse=False)
    v = arr[int(len(arr)/2)]
    return v if len(arr)%2 else (arr[int(len(arr)/2)-1]+v)/2
```

## PHP
```php
function median($a) {
  sort($a);
  $v = $a[(int) count($a)/2];
  return count($a)%2 ? $v : ($a[(int) count($a)/2 - 1] + $v)/2;
}
```