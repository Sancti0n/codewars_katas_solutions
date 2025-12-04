https://www.codewars.com/kata/576757b1df89ecf5bd00073b

## JavaScript
```js
function towerBuilder(nFloors) {
  let t = [];
  for (let i=0;i<nFloors;i++) {
    t.push(" ".repeat(nFloors-i-1) + "*".repeat(2*(i+1)-1) + " ".repeat(nFloors-i-1));
  }
  return t
}
```

## Python
```py
def tower_builder(n_floors):
    return [" "*(n_floors-i-1) + "*"*(2*i + 1) + " "*(n_floors-i-1) for i in range(n_floors)]
```

## PHP
```php
function tower_builder(int $n): array {
  $t = [];
  for ($i=0;$i<$n;$i++) {
    $t[] = str_repeat(" ", $n-$i-1).str_repeat("*", 2*$i + 1).str_repeat(" ", $n-$i-1);
  }
  return $t;
}
```

## TypeScript
```ts
export const towerBuilder = (nFloors: number): string[] => {
  let t = [];
  for (let i=0;i<nFloors;i++) {
    t.push(" ".repeat(nFloors-i-1) + "*".repeat(2*(i+1)-1) + " ".repeat(nFloors-i-1));
  }
  return t
}
```