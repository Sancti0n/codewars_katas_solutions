https://www.codewars.com/kata/5410c0e6a0e736cf5b000e69

## Python
```python
def hamming(a,b):
    d = 0
    for i in range(len(a)):
        if a[i] != b[i]: d += 1
    return d
```

## JavaScript
```js
function hamming(a,b) {
  let d = 0;
  for (let i=0;i<a.length;i++) if (a[i] != b[i]) d++;
  return d
}
```

## PHP
```php
function hamming(string $a, string $b): int {
  $d = 0;
  for ($i=0;$i<strlen($a);$i++) {
    if ($a[$i] != $b[$i]) $d++;
  }
  return $d;
}
```