https://www.codewars.com/kata/523f5d21c841566fde000009

## JavaScript
```js
function arrayDiff(a, b) {
  if (a.length == 0) return []
  let t = [];
  for (let i=0;i<a.length;i++) {
    if (b.indexOf(a[i]) == -1) t.push(a[i]);
  }
  return t
}
```

## Python
```python
def array_diff(a, b):
    t = []
    for i in a:
        if i not in b: t.append(i)
    return t
```

## PHP
```php
function arrayDiff($a, $b) {
  $t = [];
  for ($i=0;$i<count($a);$i++) {
    if (!in_array($a[$i], $b)) $t[] = $a[$i];
  }
  return $t;
}
```

## TypeScript
```ts
export function arrayDiff(a: number[], b: number[]): number[] {
  if (a.length == 0) return []
  let t = [];
  for (let i=0;i<a.length;i++) {
    if (b.indexOf(a[i]) == -1) t.push(a[i]);
  }
  return t
}
```