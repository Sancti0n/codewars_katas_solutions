https://www.codewars.com/kata/5552101f47fc5178b1000050

## Python
```python
def dig_pow(n, p):
    s = str(n)
    v = 0
    for i in range(len(s)):
        v += int(s[i])**p
        p += 1
    if (v/n).is_integer(): return v/n
    return -1
```

## JavaScript
```js
function digPow(n, p) {
  let s = n.toString();
  let v = 0;
  for (let i=0;i<s.length;i++) {
    v += parseInt(s[i])**p;
    p++;
  }
  return Number.isInteger(v/n) ? v/n : -1
}
```

## PHP
```php
function digPow($n, $p) {
  $s = strval($n);
  $v = 0;
  for ($i=0;$i<strlen($s);$i++) {
    $v += pow(intval($s[$i]),$p);
    $p++;
  }
  if (is_int($v/$n)) return $v/$n;
  return -1;
}
```

## TypeScript
```ts
export class G964 {
  public static digPow = (n: number, p: number) => {
    let s = n.toString(), v = 0;
    for (let i=0;i<s.length;i++) {
      v += parseInt(s[i])**p;
      p++;
    }
    return Number.isInteger(v/n) ? v/n : -1
  }
}
```