https://www.codewars.com/kata/5769b3802ae6f8e4890009d2

## JavaScript
```js
function removeEveryOther(arr){
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (i%2 === 0) t.push(arr[i]);
  }
  return t
}
```

## Python
```py
def remove_every_other(my_list):
    return my_list[::2]
```

## PHP
```php
function removeEveryOther($arr) {
  $val = 1;
  foreach ($arr as $k => $v) {
    if ($k%2 == $val) {
      unset($arr[$k]);
    }
  }
  return $arr;
}
```