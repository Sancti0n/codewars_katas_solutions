https://www.codewars.com/kata/57b5907920b104772c00002a/train/python

## Python
```python
def height(n):
    v = a = 2000000
    for i in range(n):
        v += a/2.5
        a /= 2.5
    return f'{v:.3f}'
```

## JavaScript
```js
function height(n) {
  let v = 2000000;
  let a = 2000000;
  for (let i=0;i<n;i++) {
    v += a/2.5;
    a /= 2.5;
  }
  return v.toFixed(3).toString()
}
```

## PHP
```php
function height(int $n): string {
  $v = $a = 2000000;
  for ($i=0;$i<$n;$i++) {
    $v += $a/2.5;
    $a /= 2.5;
  }
  return number_format($v, 3, '.', '');
}
```