https://www.codewars.com/kata/53907ac3cd51b69f790006c5

## JavaScript
```js
function triangleType(a, b, c){
  let t = [a,b,c];
  t.sort((a,b)=>a-b);
  if (2*t[2]>=t.reduce((p,c) => p+c, 0)) return 0
  else if (t[2]**2 < t[0]**2 + t[1]**2) return 1
  else if (t[2]**2 == t[0]**2 + t[1]**2) return 2
  else if (t[2]**2 > t[0]**2 + t[1]**2) return 3
}
```

## Python
```python
def triangle_type(a, b, c):
    t = [a,b,c]
    t.sort()
    if 2*t[2]>=sum(t): return 0
    elif t[2]**2 < t[0]**2 + t[1]**2: return 1
    elif t[2]**2 == t[0]**2 + t[1]**2: return 2
    elif t[2]**2 > t[0]**2 + t[1]**2: return 3
```

## PHP
```php
function triangleType($a, $b, $c) {
  $t = [$a,$b,$c];
  sort($t);
  if (2*$t[2]>=array_sum($t)) return 0;
  else if ($t[2]**2 < $t[0]**2 + $t[1]**2) return 1;
  else if ($t[2]**2 == $t[0]**2 + $t[1]**2) return 2;
  else if ($t[2]**2 > $t[0]**2 + $t[1]**2) return 3;
}
```