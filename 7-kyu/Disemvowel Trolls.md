https://www.codewars.com/kata/52fba66badcd10859f00097e

## JavaScript
```js
function disemvowel(str) {
    let t = ['a','e','i','o','u'];
    let w = ''
    for (let i=0;i<str.length;i++) {
      if (t.indexOf(str[i].toLowerCase()) === -1) {
        w += str[i]
      }   
    }
  return w;
}
```

## Python
```python
def disemvowel(s):
    t = ['a','e','i','o','u']
    w = ''
    for i in range(len(s)):
        if s[i].lower() not in t:
            w += s[i]
    return w
```

## PHP
```php
function disemvowel($string) {
  $t = ["a", "e", "i", "o", "u"];
  $w = "";
  for ($i=0;$i<strlen($string);$i++) {
    if (!in_array(strtolower($string[$i]), $t)) $w .= $string[$i];
  }
  return $w;
}
```