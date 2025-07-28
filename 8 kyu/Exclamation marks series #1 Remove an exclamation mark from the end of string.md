https://www.codewars.com/kata/57fae964d80daa229d000126

## Python
```python
def remove(s):
    if s == '!' or s == "": return s
    elif s[-1] == '!': return s[:-1]
    return s
```

## JavaScript
```js
function remove(s) {
  if (s == '!' || s == "") return s
  if (s[s.length-1] == '!') return s.slice(0, s.length-1)
  return s
}
```

## PHP
```php
function remove(string $s): string {
  if ($s == '!' || $s == "") return $s;
  if ($s[strlen($s)-1] == '!') return substr($s, 0, strlen($s)-1);
  return $s;
}
```