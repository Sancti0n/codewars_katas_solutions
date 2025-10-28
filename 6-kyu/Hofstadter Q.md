https://www.codewars.com/kata/5897cdc26551af891c000124/train/python

## Python
```python
def hofstadter_q(n):
    if n<3: return 1
    t = [1,1,2]
    i = 3
    while i<n:
        t.append(t[i-t[i-1]] + t[i-t[i-2]])
        i += 1
    return t[-1]
```

## JavaScript
```js
function hofstadterQ(n) {
  if (n<3) return 1
  let t = [1,1,2], i = 3;
  while (i<n) {
    t.push(t[i-t[i-1]] + t[i-t[i-2]]);
    i++;
  }
  return t[t.length-1]
}
```

## PHP
```php
function hofstadter_q(int $n): int {
  if ($n<3) return 1;
  $t = [1,1,2];
  $i = 3;
  while ($i<$n) {
    $t[] = ($t[$i-$t[$i-1]] + $t[$i-$t[$i-2]]);
    $i++;
  }
  return $t[count($t)-1];
}
```