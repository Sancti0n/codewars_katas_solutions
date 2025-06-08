https://www.codewars.com/kata/593f50f343030bd35e0000c6

## Python
```python
import string

def encode(s):
    l = list(string.ascii_lowercase)
    w = ""
    for i in range(len(s)):
        if s[i].lower() in l:
            if l.index(s[i].lower())%2 == 0: w += "0"
            else: w += "1"
        else: w += s[i]
    return w
```

## JavaScript
```js
function encode(s){
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let w = "";
  for (let i=0;i<s.length;i++) {
    if (l.indexOf(s[i].toLowerCase())>-1) {
      if (l.indexOf(s[i].toLowerCase())%2 == 0) w += "0";
      else w += "1";
    }
    else w += s[i];
  }
  return w
}
```

## PHP
```php
function encode(string $s): string {
  $l = range('a', 'z');
  $w = "";
  for ($i=0;$i<strlen($s);$i++) {
    if (in_array(strtolower($s[$i]), $l)) {
      if (array_search(strtolower($s[$i]), $l)%2 == 0) $w .= "0";
      else $w .= "1";
    }
    else $w .= $s[$i];
  }
  return $w;
}
```