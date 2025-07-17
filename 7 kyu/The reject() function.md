https://www.codewars.com/kata/52988f3f7edba9839c00037d

## Python
```python
def reject(seq, predicate):
    return [i for i in seq if not predicate(i)]
```

## JavaScript
```js
function reject(array, predicate) {
  let t = [];
  for (let i=0;i<array.length;i++) {
    if (!predicate(array[i])) t.push(array[i]);
  }
  return t
}
```

## PHP
```php
function reject($array, $predicate) {
  $t = [];
  for ($i=0;$i<count($array);$i++) {
    if (!$predicate($array[$i])) $t[] = $array[$i];
  }
  return $t;
}
```