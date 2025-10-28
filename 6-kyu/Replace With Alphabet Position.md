https://www.codewars.com/kata/546f922b54af40e1e90001da

## Python
```python
import string
def alphabet_position(text):
    l = list(string.ascii_lowercase)
    text = text.lower()
    w = []
    for i in range(len(text)):
        if text[i] in l:
            w.append(str(l.index(text[i])+1))
    return " ".join(w)
```

## PHP
```php
function alphabet_position(string $s): string {
  $l = range('a','z');
  $txt = strtolower($s);
  $w = [];
  for ($i=0;$i<strlen($txt);$i++) {
    if (in_array($txt[$i], $l)) $w[] = strval(strpos(implode("",$l), $txt[$i])+1);
  }
  return implode(" ",$w);
}
```

## JavaScript
```js
function alphabetPosition(text) {
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  text = text.toLowerCase();
  let w = [];
  for (let i=0;i<text.length;i++) {
    if (l.indexOf(text[i]) > -1) w.push((l.indexOf(text[i])+1).toString());
  }
  return w.join(" ")
}
```