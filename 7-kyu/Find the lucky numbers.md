https://www.codewars.com/kata/580435ab150cca22650001fb

## Python
```py
def filter_lucky(lst):
    return [i for i in lst if '7' in str(i)]
```

## JavaScript
```js
var filterLucky=x=>{
  let t = [];
  for (let i=0;i<x.length;i++) {
    if (x[i].toString().indexOf('7')>-1) t.push(x[i])
  }
  return t
}
```

## PHP
```php
function filter_lucky(array $a): array {
  $t = [];
  for ($i=0;$i<count($a);$i++) {
    if (str_contains($a[$i], '7')) $t[] = $a[$i];
  }
  return $t;
}
```