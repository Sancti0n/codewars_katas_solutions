https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

## Python
```python
def accum(s):
    w = ''
    for i in range(len(s)):
        w += s[i].upper() + s[i].lower()*i + '-'
    return w[:-1]
```

## PHP
```php
function accum($s) {
  $w = "";
  $s = strtolower($s);
  for ($i=0;$i<strlen($s);$i++) {
    $w .= ucwords(str_repeat($s[$i], $i+1))."-";
  }
  return substr($w, 0, strlen($w)-1);
}
```

## JavaScript
```js
function accum(s) {
	let w = '';
  for (let i=0;i<s.length;i++) {
    w += s[i].toUpperCase() + s[i].toLowerCase().repeat(i) + '-';
  }
  return w.substring(0, w.length-1)
}
```