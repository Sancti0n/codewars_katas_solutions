https://www.codewars.com/kata/5b4e779c578c6a898e0005c5

## Python
```python
def draw_stairs(n):
    w = ""
    for i in range(n):
        w += " "*i+"I\n"
    return w[:-1]
```

## JavaScript
```js
function drawStairs(n) {
  let w = "";
  for (let i=0;i<n;i++) {
    w += " ".repeat(i)+"I\n";
  }
  return w.substring(0, w.length-1)
}
```

## PHP
```php
function draw_stairs($n){
  $v = "";
  for ($i=0;$i<$n;$i++) {
    $v .= str_repeat(" ", $i) . "I\n";
  }
  return substr($v, 0, strlen($v)-1);
}
```