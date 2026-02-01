https://www.codewars.com/kata/588e2a1ad1140d31cb00008c

## Python
```py
def generate_pairs(m, n):
    t = []
    for i in range(m, n+1):
        for j in range(i, n+1):
            t.append((i, j))
    return t
```

## JavaScript
```js
function generatePairs(m, n) {
  let t = [];
  for (let i=m;i<=n;i++) {
    for (let j=i;j<=n;j++) {
      t.push([i,j]);
    }
  }
  return t
}
```

## PHP
```php
function generatePairs($m,$n) {
  $t = [];
  for ($i=$m;$i<=$n;$i++) {
    for ($j=$i;$j<=$n;$j++) {
      $t[] = [$i,$j];
    }
  }
  return $t;
}
```