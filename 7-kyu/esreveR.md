https://www.codewars.com/kata/5413759479ba273f8100003d

## JavaScript
```js
reverse = function(array) {
  let t = [];
  t.length = array.length
  for (let i=array.length-1;i>=0;i--) {
    t[array.length-i-1] = array[i];
  }
  return t
}
```

## Python
```py
def reverse(lst):
    l = [0]*len(lst)
    for i in range(len(lst)):
        l[len(lst)-i-1] = lst[i]
    return l
```

## PHP
```php
function reverse(array $a): array {
  $t = array_fill(0, count($a), 0);
  for ($i=count($a)-1;$i>=0;$i--) {
    $t[count($a)-$i-1] = $a[$i];
  }
  return $t;
}
```