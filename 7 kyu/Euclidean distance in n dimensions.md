https://www.codewars.com/kata/595877be60d17855980013d3

## Python
```python
def euclidean_distance(p1, p2):
    s = 0
    for i in range(len(p1)):
        s += (p2[i]-p1[i])**2
    return round(s**(1/2), 2)
```

## JavaScript
```js
function euclideanDistance(p1, p2) {
  let s = 0;
  for (let i=0;i<p1.length;i++) {
    s += (p2[i]-p1[i])**2;
  }
  return Math.round(s**0.5*100)/100
}
```

## PHP
```php
function euclidean_distance(array $a, array $b): float {
  $s = 0;
  for ($i=0;$i<count($a);$i++) {
    $s += ($b[$i]-$a[$i])**2;
  }
  return round($s**0.5,2);
}
```