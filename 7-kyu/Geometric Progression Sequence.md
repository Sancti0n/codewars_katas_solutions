https://www.codewars.com/kata/55caef80d691f65cb6000040

## Python
```python
def geometric_sequence_elements(a, r, n):
    w = str(a)
    i = 1
    while i<n:
        a *= r
        w += ", "+str(a)
        i += 1
    return w
```

## JavaScript
```js
function geometricSequenceElements(a, r, n){
  let w = a.toString();
  let i = 1;
  while (i<n) {
    a *= r;
    w += ", "+a.toString();
    i++;
  }
  return w
}
```

## PHP
```php
function geometric_sequence_elements(int $a, int $r, int $n): string {
  $w = strval($a);
  $i = 1;
  while ($i<$n) {
    $a *= $r;
    $w .= ", ".strval($a);
    $i++;
  }
  return $w;
}
```