https://www.codewars.com/kata/54e6533c92449cc251001667

## Python
```python
def unique_in_order(t):
    a = []
    for i in range(len(t)):
        if i == 0 or t[i] != a[-1]: a.append(t[i])
    return a
```

## JavaScript
```js
var uniqueInOrder=function(iterable){
  let a = []
  for (let i=0;i<iterable.length;i++) {
    if (i === 0 || iterable[i] != a[a.length-1]) a.push(iterable[i])
  }
  return a
}
```

## PHP
```php
function uniqueInOrder($iterable){
  $a = [];
  if (is_array($iterable)) $arr = $iterable;
  else $arr = str_split($iterable);
  if ($arr[0] == '') return [];
  for ($i=0;$i<count($arr);$i++) {
    if ($i == 0 || $arr[$i] != $a[count($a)-1]) $a[] = $arr[$i];
  }
  return $a;
}
```