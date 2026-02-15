https://www.codewars.com/kata/564057bc348c7200bd0000ff

## Python
```python
def thirt(n):
    t = [1,10,9,12,3,4]
    w = str(n)[::-1]
    s = sum([int(w[i])*t[i%6] for i in range(len(w))])
    temp = 0
    while s != temp:
        temp = s
        s = str(s)[::-1]
        s = sum([int(s[i])*t[i%6] for i in range(len(s))])
    return s
```

## JavaScript
```js
function sumArr(a, t) {
  let s = 0;
  for (let i=0;i<a.length;i++) {
    s += parseInt(a[i])*t[i%6];
  }
  return s
}

function thirt(n) {
  let t = [1,10,9,12,3,4];
  let v = n.toString().split("").reverse().join("");
  let s = sumArr(v, t);
  let temp = 0;
  while (s != temp) {
    temp = s;
    s = s.toString().split("").reverse().join("");
    s = sumArr(s, t);
  }
  return s
}
```

## PHP
```php
function sumArr($a, $t) {
  $s = 0;
  for ($i=0;$i<strlen($a);$i++) {
    $s += intval($a[$i])*$t[$i%6];
  }
  return $s;
}

function thirt($n) {
  $t = [1,10,9,12,3,4];
  $v = strrev(strval($n));
  $s = sumArr($v, $t);
  $temp = 0;
  while ($s != $temp) {
    $temp = $s;
    $s = strrev(strval($s));
    $s = sumArr($s, $t);
  }
  return $s;
}
```