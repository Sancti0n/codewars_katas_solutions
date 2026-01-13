https://www.codewars.com/kata/58049aa58f5e65b6da0000ef

## JavaScript
```js
function iccanobif(n) {
  let a = 0, b = 1, temp = 0, t = [];
  for (let i=0;i<n;i++) {
    t.push(b);
    temp = b;
    b = a + b;
    a = temp;
  }
  return t.reverse()
}
```

## PHP
```php
function iccanobif($n) {
  $a = 0;
  $b = 1;
  $temp = 0;
  $t = [];
  for ($i=0;$i<$n;$i++) {
    $t[] = $b;
    $temp = $b;
    $b = $a + $b;
    $a = $temp;
  }
  return array_reverse($t);
}
```