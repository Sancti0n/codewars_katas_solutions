https://www.codewars.com/kata/58f6024e1e26ec376900004f

## JavaScript
```js
function factors(integer, limit){
  if (limit>integer) return []
  if (limit == integer) return [limit]
  let t = [];
  while (limit<=integer) {
    if (integer%limit == 0) t.push(limit);
    limit++;
  }
  return t
}
```

## Python
```python
def factors(integer, limit):
    t = []
    for i in range(limit, integer+1):
        if integer%i == 0: t.append(i)
    return t
```

## PHP
```php
function factors(int $integer, int $limit): array {
  $t = [];
  for ($i=$limit;$i<=$integer;$i++) {
    if ($integer%$i == 0) $t[] = $i;
  }
  return $t;
}
```