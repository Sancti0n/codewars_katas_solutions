https://www.codewars.com/kata/58b8c94b7df3f116eb00005b

## Python
```python
import string

def reverse_letter(s):
    t = list(string.ascii_lowercase)
    w = ""
    for i in range(len(s)-1, -1, -1):
        if s[i] in t: w += s[i]
    return w
```

## JavaScript
```js
function reverseLetter(str) {
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let w = "";
  for (let i=str.length-1;i>=0;i--) {
    if (l.indexOf(str[i])>-1) w += str[i];
  }
  return w
}
```

## PHP
```php
function reverseLetter($str){
  $t = range('a', 'z');
  $w = "";
  for ($i=strlen($str)-1;$i>=0;$i--) {
    if (in_array($str[$i], $t)) $w .= $str[$i];
  }
  return $w;
}
```