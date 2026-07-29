https://www.codewars.com/kata/5663f5305102699bad000056

## Python
```py
def sizeEl(arr):
    if len(arr) == 0: return -1
    maxi = 0
    mini = len(arr[0])
    for i in range(len(arr)):
        if maxi<len(arr[i]): maxi = len(arr[i])
        if mini>len(arr[i]): mini = len(arr[i])
    return maxi, mini

def mxdiflg(a1, a2):
    a = sizeEl(a1)
    b = sizeEl(a2)
    if a == -1 or b == -1: return -1
    return max(abs(a[0]-b[1]),abs(a[1]-b[0]))
```

## JavaScript
```js
function sizeEl(arr) {
  if (arr.length == 0) return -1
  let maxi = 0;
  let mini = arr[0].length;
  for (let i=0;i<arr.length;i++) {
    if (maxi<arr[i].length) maxi = arr[i].length;
    if (mini>arr[i].length) mini = arr[i].length;
  }
  return [maxi, mini]
}

function mxdiflg(a1, a2) {
  let a = sizeEl(a1);
  let b = sizeEl(a2);
  if (a === -1 || b === -1) return -1
  return Math.max(Math.abs(a[0]-b[1]),Math.abs(a[1]-b[0]))
}
```

## PHP
```php
function sizeEl($arr) {
  if (count($arr) == 0) return -1;
  $maxi = 0;
  $mini = strlen($arr[0]);
  for ($i=0;$i<count($arr);$i++) {
    if ($maxi<strlen($arr[$i])) $maxi = strlen($arr[$i]);
    if ($mini>strlen($arr[$i])) $mini = strlen($arr[$i]);
  }
  return [$maxi, $mini];
}

function mxdiflg($a1, $a2) {
  $a = sizeEl($a1);
  $b = sizeEl($a2);
  if ($a == -1 || $b == -1) return -1;
  return max(abs($a[0]-$b[1]),abs($a[1]-$b[0]));
}
```