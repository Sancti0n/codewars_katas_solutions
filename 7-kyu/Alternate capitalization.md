https://www.codewars.com/kata/59cfc000aeb2844d16000075

## Python
```python
def capitalize(s):
    t = ["",""]
    for i in range(len(s)):
        if i%2==0: t[0] += s[i].upper()
        else: t[0] += s[i].lower()
        if i%2==0: t[1] += s[i].lower()
        else: t[1] += s[i].upper()
    return t
```

## JavaScript
```js
function capitalize(s){
  let t = ["",""];
  for (let i=0;i<s.length;i++) {
    if (i%2==0) {
      t[0] += s[i].toUpperCase();
      t[1] += s[i].toLowerCase();
    }
    else {
      t[0] += s[i].toLowerCase();
      t[1] += s[i].toUpperCase();
    }
  }
  return t;
};
```

## PHP
```php
function capitalize($s) {
  $t = ["",""];
  for ($i=0;$i<strlen($s);$i++) {
    if ($i%2==0) {
      $t[0] .= strtoupper($s[$i]);
      $t[1] .= strtolower($s[$i]);
    }
    else {
      $t[0] .= strtolower($s[$i]);
      $t[1] .= strtoupper($s[$i]);
    }
  }
  return $t;
}
```