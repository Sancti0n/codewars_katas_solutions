https://www.codewars.com/kata/580a0347430590220e000091

## JavaScript
```js
function area(d,l) {
  if (d<=l) return "Not a rectangle"
  let a = (d**2 - l**2)**.5
  return parseFloat(Number.parseFloat(a*l).toFixed(2))
}
```

## Python
```py
def area(d, l):
    if d<=l: return "Not a rectangle"
    a = (d**2 - l**2)**.5
    return round(a*l, 2)
```

## PHP
```php
function area($d, $l) {
  if ($d<=$l) return "Not a rectangle";
  $a = ($d**2 - $l**2)**.5;
  return round($a*$l, 2);
}
```