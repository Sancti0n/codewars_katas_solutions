https://www.codewars.com/kata/52597aa56021e91c93000cb0

## Python
```python
def move_zeros(array):
    c = array.count(0)
    while 0 in array: array.remove(0)
    while c>0:
        array.append(0)
        c -= 1
    return array
```

## JavaScript
```js
function moveZeros(arr) {
  let c = arr.filter(elt => elt === 0).length;
  while (arr.indexOf(0)>-1) arr.splice(arr.indexOf(0), 1)
  while (c>0) {
    arr.push(0);
    c--;
  }
  return arr
}
```

## PHP
```php
function moveZeros(array $items): array {
  $c = 0;
  $t = [];
  for ($i=0;$i<count($items);$i++) {
    if ($items[$i] != 0 || $items[$i] == "") $t[] = $items[$i];
    else $c++;
  }
  while ($c>0) {
    $t[] = 0;
    $c--;
  }
  return $t;
}
```