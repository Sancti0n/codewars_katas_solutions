https://www.codewars.com/kata/524f5125ad9c12894e00003f

## Python
```python
def remainder(a,b):
    if min(a,b) == 0: return None
    elif max(a,b) == 0: return 0
    elif a>=b: return a%b
    elif a<b: return b%a
```

## JavaScript
```js
function remainder(a, b){
  if (Math.min(a,b) == 0) return NaN
  if (Math.max(a,b) == 0) return 0
  if (a>=b) return a%b
  if (a<b) return b%a
}
```

## PHP
```php
function remainder($a, $b) {
  if (min($a,$b) == 0) return null;
  if (max($a,$b) == 0) return 0;
  if ($a>=$b) return $a%$b;
  if ($a<$b)return $b%$a;
}
```