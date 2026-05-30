https://www.codewars.com/kata/580dda86c40fa6c45f00028a

## JavaScript
```js
function cubeOdd(arr) {
  console.log(arr)
  let s = 0
  for (let i=0;i<arr.length;i++) {
    if (typeof(arr[i]) === 'number' && Math.abs(arr[i])%2 == 1) s += Math.pow(arr[i],3)
    if (typeof(arr[i]) !== 'number') return undefined
  }
  return s
}
```

## Python
```py
def cube_odd(arr):
    s = 0
    for i in range(len(arr)):
        if type(arr[i]) == int and arr[i]%2 == 1: s += arr[i]**3
        if type(arr[i]) != int: return None
    return s
```

## PHP
```php
function cube_odd($a) {
  $s = 0;
  for ($i=0;$i<count($a);$i++) {
    if (gettype($a[$i]) == 'integer' && abs($a[$i])%2 == 1) $s += pow($a[$i],3);
    if (gettype($a[$i]) != 'integer') return NULL;
  }
  return $s;
}
```