https://www.codewars.com/kata/5b180e9fedaa564a7000009a

## Python
```python
import string

def solve(s):
    t = list(string.ascii_uppercase)
    c = 0
    for i in range(len(s)):
        if s[i] in t: c += 1
        if c>len(s)/2: return s.upper()
    return s.lower()
```

## JavaScript
```js
function solve(s){
  let t = String.fromCharCode(...Array(91).keys()).slice(65).split("");
  let c = 0;
  for (let i=0;i<s.length;i++) {
    if (t.indexOf(s[i])>-1) c++;
    if (c>s.length/2) return s.toUpperCase()
  }
  return s.toLowerCase()
}
```

## PHP
```php
function solve($s) {
  $t = range('A', 'Z');
  $c = 0;
  for ($i=0;$i<strlen($s);$i++) {
    if (in_array($s[$i], $t)) $c++;
    if ($c>strlen($s)/2) return strtoupper($s);
  }
  return strtolower($s);
}
```