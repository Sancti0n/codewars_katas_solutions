https://www.codewars.com/kata/571965ccdf7fdb10a00000ea

## JavaScript
```js
function sumLength(arr) {
  let t = [0, 0], b = false;
  for (let i=0;i<arr.length;i++) {
    if (arr[i] == 0) {
      if (!b) t[1]++;
      b = !b;
    }
    if (arr[i]<0) t[1]++;
    if (arr[i]>0) t[0] += arr[i];
  }
  return "" + t[0] + " " + t[1]
}
```

## PHP
```php
function sum_length($arr) {
  $t = [0, 0];
  $b = false;
  for ($i=0;$i<count($arr);$i++) {
    if ($arr[$i] == 0) {
      if (!$b) $t[1]++;
      $b = !$b;
    }
    if ($arr[$i]<0) $t[1]++;
    if ($arr[$i]>0) $t[0] += $arr[$i];
  }
  return strval($t[0]) . " " . strval($t[1]);
}
```