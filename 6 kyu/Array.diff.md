Implement a function that computes the difference between two lists. The function should remove all occurrences of elements from the first list (a) that are present in the second list (b). The order of elements in the first list should be preserved in the result.
Examples

If a = [1, 2] and b = [1], the result should be [2].

If a = [1, 2, 2, 2, 3] and b = [2], the result should be [1, 3].

## JavaScript
```js
function arrayDiff(a, b) {
  if (a.length == 0) return []
  let t = [];
  for (let i=0;i<a.length;i++) {
    if (b.indexOf(a[i]) == -1) t.push(a[i]);
  }
  return t
}
```

## Python
```python
def array_diff(a, b):
    t = []
    for i in a:
        if i not in b: t.append(i)
    return t
```

## PHP
```php
function arrayDiff($a, $b) {
  $t = [];
  for ($i=0;$i<count($a);$i++) {
    if (!in_array($a[$i], $b)) $t[] = $a[$i];
  }
  return $t;
}
```