https://www.codewars.com/kata/5526fc09a1bbd946250002dc

## Python
```python
def find_outlier(integers):
    o, e = 0, 0
    for i in integers:
        if i%2 == 0:e += 1
        else: o += 1
    if e>o: v = 1
    else: v = 0
    for j in integers:
        if j%2 == v: return j
```

## JavaScript
```js
function findOutlier(integers){
  let odd = []
  let even = []
  for (let i=0;i<integers.length;i++) {
    integers[i]%2 === 0 ? even.push(integers[i]): odd.push(integers[i])
  }
  if (even.length>odd.length) return odd[0]
  return even[0]
}
```

## PHP
```php
function find($integers) {
  $odd = [];
  $even = [];
  for ($i=0;$i<count($integers);$i++) {
    if ($integers[$i]%2 == 0) $even[] = $integers[$i];
    else $odd[] = $integers[$i];
  }
  if (count($even)>count($odd)) return $odd[0];
  return $even[0];
}
```