https://www.codewars.com/kata/596f6385e7cd727fff0000d6

## Python
```py
def avg_array(arrs):
    t = arrs[0]
    for i in range(1, len(arrs)):
        for j in range(len(arrs[i])):
            t[j] += arrs[i][j]
    return [i/len(arrs) for i in t]
```

## JavaScript
```js
function avgArray(arr) {
  let t = arr[0];
  for (let i=1;i<arr.length;i++) {
    for (let j=0;j<arr[i].length;j++) {
      t[j] += arr[i][j]
    }
  }
  for (let k=0;k<t.length;k++) {
    t[k] /= arr.length;
  }
  return t
}
```

## PHP
```php
function avgArray(array $arr) : array {
  $t = $arr[0];
  for ($i=1;$i<count($arr);$i++) {
    for ($j=0;$j<count($arr[$i]);$j++) {
      $t[$j] += $arr[$i][$j];
    }
  }
  for ($k=0;$k<count($t);$k++) {
    $t[$k] /= count($arr);
  }
  return $t;
}
```