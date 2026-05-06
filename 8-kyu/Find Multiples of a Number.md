https://www.codewars.com/kata/58ca658cc0d6401f2700045f

## Python
```py
def find_multiples(integer, limit):
    return list(range(integer, limit+1, integer))
```

## JavaScript
```js
function findMultiples(integer, limit) {
  let t = [];
  let i = 1;
  while (integer*i<=limit) {
    t.push(integer*i);
    i += 1;
  }
  return t
}
```

## TypeScript
```ts
export function findMultiples(integer: number, limit: number): number[] {
  let t = [];
  let i = 1;
  while (integer*i<=limit) {
    t.push(integer*i);
    i += 1;
  }
  return t
}
```

## PHP
```php
function findMultiples(int $integer, int $limit): array {
  $t = [];
  $i = 1;
  while ($integer*$i <= $limit) {
    $t[] = $integer*$i;
    $i++;
  }
  return $t;
}
```