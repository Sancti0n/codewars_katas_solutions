https://www.codewars.com/kata/544aed4c4a30184e960010f4

## Python
```python
def divisors(integer):
    i = 2
    t = []
    while i<(integer/2)+1:
        if (integer/i).is_integer(): t.append(i)
        i+=1
    if len(t) == 0: return str(integer)+" is prime"
    else: return t
```

## JavaScript
```js
function divisors(integer) {
  let i = 2;
  let t = [];
  while (i<(integer/2)+1) {
    if (Number.isInteger(integer/i)) t.push(i);
    i++;
  }
  if (t.length == 0) return integer.toString()+" is prime"
  else return t
};
```

## PHP
```php
function divisors($integer) {
  $i = 2;
  $t = [];
  while ($i<($integer/2)+1) {
    if (is_int($integer/$i)) $t[] = $i;
    $i++;
  }
  if (count($t) == 0) return strval($integer)." is prime";
  else return $t;
}
```

## TypeScript
```ts
export function divisors(integer: number): number[] | string {
  let i = 2;
  let t = [];
  while (i<(integer/2)+1) {
    if (Number.isInteger(integer/i)) t.push(i);
    i++;
  }
  if (t.length == 0) return integer.toString()+" is prime"
  else return t
}
```