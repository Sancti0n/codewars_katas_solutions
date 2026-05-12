https://www.codewars.com/kata/5b096efeaf15bef812000010

## Python
```py
def nth_floyd(n):
    t = []
    i, a = 1, 1
    while i<=n:
        t.append(i)
        i += a
        a += 1
    return len(t)
```

## JavaScript
```js
function nthFloyd(n){
  let t = []
  let i = 1
  let a = 1
  while (i<=n) {
    t.push(i)
    i += a
    a += 1
  }
  return t.length
}
```

## PHP
```php
function nth_floyd($n) : int {
  $t = [];
  $i = 1;
  $a = 1;
  while ($i<=$n) {
    $t[] = $i;
    $i += $a;
    $a += 1;
  }
  return count($t);
}
```