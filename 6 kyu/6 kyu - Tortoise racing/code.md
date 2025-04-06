Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal, COBOL, Erlang, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1 -1" for others.

## Python
```python
from math import *

def race(v1, v2, g):
    if v1>=v2: return None
    h = int(g/(v2-v1))
    m = int(g/(v2-v1)*60)%60
    s = int(((g/(v2-v1)*60)%1)*100*.6)
    return [h,m,s]
```

## JavaScript
```js
function race(v1, v2, g) {
  let t = 3600*g/(v2-v1);
  return v2>v1 ? [Math.floor(t/3600), Math.floor(t/60%60), Math.floor(t%60)] : null
}
```

## PHP
```php
function race($v1, $v2, $g) {
  $t = 3600*$g/($v2-$v1);
  return $v2>$v1 ? [(int)($t/3600), (int)($t/60%60), (int)($t%60)] : null;
}
```

## Java
```java
public class Tortoise {
  public static int[] race(int v1, int v2, int g) {
    int t = 3600*g/(v2-v1);
    return v2>v1 ? new int[] {t/3600, t/60%60, t%60} : null;
  }
}
```