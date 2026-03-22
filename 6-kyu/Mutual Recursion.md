https://www.codewars.com/kata/53a1eac7e0afd3ad3300008b

## Python
```python
def f(n):
    if n == 0: return 1
    return n - m(f(n-1))

def m(n):
    if n == 0: return 0
    return n - f(m(n-1))
```

## JavaScript
```js
function F(n) {
  if (n == 0) return 1
  return n - M(F(n-1))
}

function M(n) {
  if (n == 0) return 0
  return n - F(M(n-1))
}
```

## Java
```java
public class MutualRecursion {
    public static int f(int n) {
      if (n == 0) return 1;
      return n - m(f(n-1));
    }
    
    public static int m(int n) {
      if (n == 0) return 0;
      return n - f(m(n-1));
    }
}
```

## TypeScript
```ts
export function F(n:number):number {
  return n == 0 ? 1 : n - M(F(n-1))
}

export function M(n:number):number {
  return n == 0 ? 0 : n - F(M(n-1))
}
```

## PHP
```php
function F(int $n): int {
  $f = [1, 1];
  $m = [0, 0];
  if ($n<2) return $f[$n];
  $i = 2;
  while ($i-1<$n) {
    $f[] = $i - $m[$f[$i-1]];
    $m[] = $i - $f[$m[$i-1]];
    $i++;
  }
  return $f[count($f)-1];
}

function M(int $n): int {
  $f = [1, 1];
  $m = [0, 0];
  if ($n<2) return $m[$n];
  $i = 2;
  while ($i-1<$n) {
    $f[] = $i - $m[$f[$i-1]];
    $m[] = $i - $f[$m[$i-1]];
    $i++;
  }
  return $m[count($m)-1];
}
```