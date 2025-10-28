https://www.codewars.com/kata/58287977ef8d4451f90001a0

## Python
```python
def is_same_language(lst):
    s = lst[0]["language"]
    for i in lst:
        if s !=  i["language"]: return False
    return True
```

## JavaScript
```js
function isSameLanguage(list) {
  let s = list[0]["language"];
  for (let i=0;i<list.length;i++) {
    if (s != list[i]["language"]) return false
  }
  return true
}
```

## PHP
```php
function is_same_language($a) {
  $s = $a[0]["language"];
  for ($i=0;$i<count($a);$i++) {
    if ($s != $a[$i]["language"]) return false;
  }
  return true;
}
```