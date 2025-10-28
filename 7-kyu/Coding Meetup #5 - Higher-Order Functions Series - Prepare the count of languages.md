https://www.codewars.com/kata/5828713ed04efde70e000346

## PHP
```php
function count_languages($a) {
  $t = [];
  for ($i=0;$i<count($a);$i++) {
    if (array_key_exists($a[$i]['language'], $t)) $t[$a[$i]['language']]++;
    else $t[$a[$i]['language']] = 1;
  }
  return $t;
}
```

## Python
```python
def count_languages(lst): 
    d = {}
    for i in range(len(lst)):
        if lst[i]['language'] in d: d[lst[i]['language']] += 1
        else: d[lst[i]['language']] = 1
    return d
```

## JavaScript
```js
function countLanguages(list) {
  let d = {};
  for (let i=0;i<list.length;i++) {
    if (list[i]['language'] in d) d[list[i]['language']] += 1;
    else d[list[i]['language']] = 1;
  }
  return d
}
```