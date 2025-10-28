https://www.codewars.com/kata/5982619d2671576e90000017

## Python
```python
def sponge_meme(s):
    w = ""
    for i in range(len(s)):
        if i%2 == 0: w += s[i].upper()
        else: w += s[i].lower()
    return w
```

## PHP
```php
function sponge_meme(string $s): string {
  $w = "";
  for ($i=0;$i<strlen($s);$i++) {
    if ($i%2 == 0) $w .= strtoupper($s[$i]);
    else $w .= strtolower($s[$i]);
  }
  return $w;
}
```

## JavaScript
```js
function spongeMeme(s) {
  let w = "";
  for (i=0;i<s.length;i++) {
    if (i%2 === 0) w += s[i].toUpperCase();
    else w += s[i].toLowerCase();
  }
  return w;
}
```