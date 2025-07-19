https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

## Python
```python
def find_short(s):
    a = s.split(' ')
    minimum = len(a[0])
    for i in range(1,len(a)):
        if len(a[i])<minimum: minimum = len(a[i])
    return minimum
```

## JavaScript
```js
function findShort(s){
  s = s.split(" ");
  let m = s[0].length;
  for (let i =0;i<s.length;i++) {
    if (s[i].length<m) m = s[i].length;
  }
  return m
}
```

## PHP
```php
function findShort($str){
  $s = explode(" ", $str);
  $min = strlen($s[0]);
  for ($i=0;$i<count($s);$i++) {
    if (strlen($s[$i])<$min) $min = strlen($s[$i]);
  }
  return $min;
}
```