https://www.codewars.com/kata/586efc2dcf7be0f217000619

## Python
```py
def reverse_slice(s):
    s = s[::-1]
    t = []
    for i in range(len(s)):
        t.append(s[i:])
    return t
```

## JavaScript
```js
function reverseSlice(str) {
  str = str.split("").reverse().join("");
  let t = [];
  for (let i=0;i<str.length;i++) {
    t.push(str.slice(i));
  }
  return t
}
```

## PHP
```php
function reverse_slice(string $s): array {
  $s = strrev($s);
  $t = [];
  for ($i=0;$i<strlen($s);$i++) {
    $t[] = substr($s, $i);
  }
  return $t;
}
```