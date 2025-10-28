https://www.codewars.com/kata/570523c146edc287a50014b1

## Python
```python
def number_joy(n):
    s = 0
    v = str(n)
    for i in range(len(v)): s += int(v[i])
    return int(str(s)[::-1])*s == n
```

## PHP
```php
function number_joy(int $n): bool {
  $s = 0;
  $v = strval($n);
  for ($i=0;$i<strlen($v);$i++) $s += intval($v[$i]);
  return intval(strrev(strval($s)))*$s == $n;
}
```

## JavaScript
```js
function numberJoy(n) {
  let s = 0;
  let v = n.toString();
  for (let i=0;i<v.length;i++) s += parseInt(v[i]);
  return parseInt(s.toString().split("").reverse().join(""))*s == n
}
```