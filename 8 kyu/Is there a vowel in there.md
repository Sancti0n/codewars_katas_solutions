https://www.codewars.com/kata/57cff961eca260b71900008f

## Python
```python
def is_vow(inp):
    t = [97, 101, 105, 111, 117]
    for i in range(len(inp)):
        if inp[i] in t: inp[i] = chr(inp[i])
    return inp
```

## JavaScript
```js
function isVow(inp) {
  let t = [97, 101, 105, 111, 117];
  for (let i=0;i<inp.length;i++) if (t.indexOf(inp[i])>-1) inp[i] = String.fromCharCode(inp[i]);
  return inp
}
```

## PHP
```php
function isVow(array $a) {
  $t = [97, 101, 105, 111, 117];
  for ($i=0;$i<count($a);$i++) {
    if (in_array($a[$i],$t)) $a[$i] = chr($a[$i]);
  }
  return $a;
}
```