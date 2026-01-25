https://www.codewars.com/kata/587b6a5e8726476f9b0000e7

## JavaScript
```js
function rotEnergies(b, jMin, jMax) {
  if (jMin>jMax || b<=0) return []
  let t = [];
  for (let i=jMin;i<=jMax;i++) {
    t.push(b*i*(i+1));
  }
  return t
}
```

## Python
```py
def rot_energies(B, Jmin, Jmax):
    if Jmin>Jmax or B<=0: return []
    return [B*i*(i+1) for i in range(Jmin, Jmax+1)]
```

## PHP
```php
function rot_energies(int $b, int $j_min, int $j_max): array {
  if ($j_min>$j_max || $b<=0) return [];
  $t = [];
  for ($i=$j_min;$i<=$j_max;$i++) {
    $t[] = $b*$i*($i+1);
  }
  return $t;
}
```