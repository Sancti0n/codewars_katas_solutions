https://www.codewars.com/kata/559e5b717dd758a3eb00005a

## JavaScript
```js
function dropCap(n) {
  let s = n.split(' ');
  let i = 0;
  while (i<s.length) {
    if (s[i].length>2) s[i] = s[i][0].toUpperCase()+s[i].substring(1).toLowerCase();
    i += 1;
  }
  return s.join(' ')
}
```

## Python
```py
def drop_cap(s):
    s = s.split(' ')
    i = 0
    while i<len(s):
        if (len(s[i])>2): s[i] = s[i].capitalize()
        i += 1
    return ' '.join(s)
```

## TypeScript
```ts
export function dropCap(s: string): string {
  let st = s.split(' '), i = 0;
  while (i<st.length) {
    if (st[i].length>2) {
      st[i] = st[i][0].toUpperCase()+st[i].substring(1).toLowerCase();
    }
    i++;
  }
  return st.join(' ');
}
```

## PHP
```php
function dropCap(string $s): string {
  $s = explode(" ", $s);
  $i = 0;
  while ($i<count($s)) {
    if (strlen($s[$i]) > 2) {
      $s[$i] = ucwords(strtolower($s[$i])); 
    }
    $i++;
  }
  return implode(" ", $s);
}
```