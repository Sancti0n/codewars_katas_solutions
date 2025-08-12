https://www.codewars.com/kata/57fafb6d2b5314c839000195

## Python
```python
def remove(s):
    t = []
    s = s.split(' ')
    for i in s:
        if i.count('!') != 1: t.append(i)
    return " ".join(t)
```

## JavaScript
```js
function remove (s) {
  let t = [];
  s = s.split(' ');
  for (let i=0;i<s.length;i++) {
    if ((s[i].match(/!/g) || []).length != 1) t.push(s[i]);
  }
  return t.join(' ')
}
```

## PHP
```php
function remove(string $s): string {
  $t = [];
  $s = explode(" ", $s);
  for ($i=0;$i<count($s);$i++) {
    if (substr_count($s[$i], '!') != 1) $t[] = $s[$i];
  }
  return implode(" ", $t);
}
```