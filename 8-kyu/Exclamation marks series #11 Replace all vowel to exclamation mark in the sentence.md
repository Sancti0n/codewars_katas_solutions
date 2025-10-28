https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed

## Python
```python
def replace_exclamation(s):
    t = ['a', 'e', 'i', 'o', 'u']
    s = list(s)
    for i in range(len(s)):
        if s[i].lower() in t: s[i] = "!"
    return "".join(s)
```

## JavaScript
```js
function replace(s){
  let t = ['a', 'e', 'i', 'o', 'u'];
  s = s.split("");
  for (let i=0;i<s.length;i++) if (t.indexOf(s[i].toLowerCase())>-1) s[i] = "!";
  return s.join("")
}
```

## PHP
```php
function replace(string $s): string {
  $t = ['a', 'e', 'i', 'o', 'u'];
  $s = str_split($s);
  for ($i=0;$i<count($s);$i++) {
    if (in_array(strtolower($s[$i]), $t)) $s[$i] = "!";
  }
  return implode("", $s);
}
```