https://www.codewars.com/kata/5656b6906de340bd1b0000ac

## TypeScript
```ts
export const longest = (s1:string, s2:string): string => {
  return [...new Set(s1.concat(s2))].sort().join('')
}
```

## JavaScript
```js
function longest(s1, s2) { 
  return [...new Set(s1.concat(s2))].sort().join('')
}
```

## Python
```py
def longest(a1, a2):
    return ''.join(sorted(set(a1) | set(a2)))
```

## PHP
```php
function longest($a, $b) {
  $s = array_unique(array_merge(str_split($a),str_split($b)));
  sort($s);
  return implode($s);
}
```