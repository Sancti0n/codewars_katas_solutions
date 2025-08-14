https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

## JavaScript
```js
function duplicateCount(text){
  let t = text.toLowerCase().split('');
  let m = [...new Set(t)];
  let c = 0;
  for (let i=0;i<m.length;i++) {
    if (t.filter(x => x === m[i]).length > 1) c += 1;
  }
  return c
}
```

## Python
```python
def duplicate_count(text):
    text = text.lower()
    c = 0
    for i in list(dict.fromkeys(list(text))):
        if text.count(i)>1: c += 1
    return c
```

## PHP
```php
function duplicateCount($text) {
  $t = strtolower($text);
  $a = count_chars($t, 3);
  if (strlen($a) == strlen($t)) return 0;
  $c = 0;
  for ($i=0;$i<strlen($a);$i++) {
    if (substr_count($t, $a[$i]) > 1) $c++;
  }
  return $c;
}
```