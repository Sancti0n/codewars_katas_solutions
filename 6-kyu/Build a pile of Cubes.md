https://www.codewars.com/kata/5592e3bd57b64d00f3000047

## JavaScript
```js
function findNb(m) {
  let n = 0;
  while ((n*(n+1)/2)**2 <= m) {
    if ((n*(n+1)/2)**2 == m) return n;
    else n++;
  }
  return -1
}
```

## PHP
```php
function findNb($m) {
  $n = 0;
  while (($n*($n+1)/2)**2 <= $m) {
    if (($n*($n+1)/2)**2 == $m) return $n;
    else $n++;
  }
  return -1;
}
```

## Python
```py
def find_nb(m):
    res, n = 0, 0
    while res<m:
        n += 1
        res += n**3
    return n if res == m else -1
```

## TypeScript
```ts
export function findNb(m: number): number {
  let n = 0;
  while ((n*(n+1)/2)**2 <= m) {
    if ((n*(n+1)/2)**2 == m) return n;
    else n++;
  }
  return -1
}
```