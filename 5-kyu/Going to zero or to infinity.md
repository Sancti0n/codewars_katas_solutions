https://www.codewars.com/kata/55a29405bc7d2efaff00007c

## Python
```py
def going(n):
    s, term = 1.0, 1.0
    for i in range(n, 1, -1):
        term *= (1.0/i)
        s += term
        if term < 1e-12:
            break
    return int(s * 1_000_000) / 1_000_000.0
```

## JavaScript
```js
function going(n) {
  let s = 1.0, term = 1.0;
  for (let i=n;i>1;i--) {
    term *= (1.0/i);
    s += term;
    if (term<1e-12) {
      break;
    }
  }
  return parseInt(s * 1_000_000)/1_000_000;
}
```

## PHP
```php
function going(int $n) : float {
  $s = 1.0;
  $term = 1.0;
  for ($i=$n;$i>1;$i--) {
    $term *= (1.0/$i);
    $s += $term;
    if ($term<1e-12) {
      break;
    }
  }
  return intval($s * 1_000_000)/1_000_000;
}
```

## TypeScript
```ts
export function going(n: number): number {
  let s: number = 1.0;
  let term: number = 1.0;
  for (let i=n;i>1;i--) {
    term *= (1.0/i);
    s += term;
    if (term < 1e-12) break;
  }
  return Math.floor(s * 1_000_000) / 1_000_000;
}
```

## Java
```java
public class Suite {
    public static double going(int n) {
        double s = 1.0;
        double term = 1.0;
        for (double i=n;i>1;i--) {
            term *= (1.0/i);
            s += term;
            if (term<1e-12) break;
        }
        return Math.floor(s * 1_000_000)/1_000_000;
    }
}
```