https://www.codewars.com/kata/5ac54bcbb925d9b437000001

## Python
```py
def find_middle(st):
    if type(st) is not str:
        return -1
    s = -1
    for i in st:
        if i.isdigit():
            if s == -1:
                s = int(i)
            else:
                s *= int(i)
    s = str(s)
    l = len(s)
    return int(s[l//2]) if l%2 else int(s[l//2 - 1:l//2 + 1])
```

## JavaScript
```js
function findMiddle(str) {
  if (typeof(str) != "string") {
    return -1;
  }
  let s = -1;
  for (let i=0;i<str.length;i++) {
    if (/^-?\d+$/.test(str[i])) {
      if (s == -1) {
        s = +str[i];
      }
      else {
        s *= +str[i];
      }
    }
  }
  s = s.toString();
  let l = s.length;
  return l%2 ? parseInt(s[Math.floor(l/2)]) : parseInt(s.slice(Math.floor(l/2) - 1, Math.floor(l/2) + 1));
}
```

## PHP
```php
function findMiddle($str): int {
  if (gettype($str) != "string") {
    return -1;
  }
  $s = -1;
  for ($i=0;$i<strlen($str);$i++) {
    if (is_numeric($str[$i])) {
      if ($s == -1) {
        $s = +$str[$i];
      }
      else {
        $s *= +$str[$i];
      }
    }
  }
  $s = strval($s);
  $l = strlen($s);
  echo $s."\n";
  return $l%2 ? intval($s[intval($l/2)]) : intval(substr($s, intval($l/2) - 1, 2));
}
```