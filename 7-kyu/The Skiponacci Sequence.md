https://www.codewars.com/kata/580777ee2e14accd9f000165

## Python
```python
def skiponacci(n):
    a, b = [0, 1]
    s = "1"
    for i in range(n-1):
        if i%2 == 0: s += " skip"
        else: s += " " + str(a+b)
        m = a
        a = b
        b = m + b
    return s
```

## JavaScript
```js
function skiponacci(n) {
  let a = 0, b = 1, s = "1", m = 0;
  for (let i=0;i<n-1;i++) {
    if (i%2<1) s += " skip";
    else s += " " + (a+b).toString();
    m = a;
    a = b;
    b = m + a;
  }
  return s
}
```

## PHP
```php
function skiponacci(int $n): string {
  $a = 0;
  $b = 1;
  $s = "1";
  $m = 0;
  for ($i=0;$i<$n-1;$i++) {
    if ($i%2<1) $s .= " skip";
    else $s .= " " . strval($a+$b);
    $m = $a;
    $a = $b;
    $b = $m + $a;
  }
  return $s;
}
```