https://www.codewars.com/kata/5a87449ab1710171300000fd

## JavaScript
```js
function tidyNumber(n){
  return n == parseInt(n.toString().split('').sort().join(''))
}
```

## Python
```python
def tidyNumber(n):
    v = list(str(n))
    v.sort()
    v = int(''.join(v))
    return n == v
```

## PHP
```php
function tidyNumber($n) {
  $s = str_split(strval($n));
  sort($s);
  $s = implode("", $s);
  return $s == $n;
}
```