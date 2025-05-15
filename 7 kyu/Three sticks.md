https://www.codewars.com/kata/57c1f22d8fbb9fd88700009b

## JavaScript
```js
function maxlen(l1, l2) {
  if (Math.min(l1,l2)*3<=Math.max(l1,l2)) return Math.max(l1,l2)/3
  if (Math.min(l1,l2)*2<=Math.max(l1,l2)) return Math.min(l1,l2)
  if (l1==l2) return l1/2
  if (Math.min(l1,l2)*2>Math.max(l1,l2)) return Math.max(l1,l2)/2
}
```

## Python
```python
def maxlen(l1,l2):
    maxi, mini = max(l1, l2), min(l1, l2)
    if(maxi/3>mini): return maxi/3
    if(maxi/2>mini): return mini
    return maxi/2
```

## PHP
```php
function maxlen(float $l1, float $l2): float {
  $max = max($l1,$l2);
  $min = min($l1,$l2);
  return $max/3>$min ? $max/3 : ($max/2>$min ? $min : $max/2);
}
```