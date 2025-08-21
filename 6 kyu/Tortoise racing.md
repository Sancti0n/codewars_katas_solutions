https://www.codewars.com/kata/55e2adece53b4cdcb900006c

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

## TypeScript
```ts
export function race(v1 : number, v2 : number, g : number) : [number, number, number] | null {
  let t = 3600*g/(v2-v1);
  return v2>v1 ? [Math.floor(t/3600), Math.floor(t/60%60), Math.floor(t%60)] : null
}
```