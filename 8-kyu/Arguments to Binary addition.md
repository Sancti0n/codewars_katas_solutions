https://www.codewars.com/kata/57642a90dee2da8dd3000161

## JavaScript
```js
function arr2bin(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    if (typeof arr[i] === 'number') {
      s += arr[i];
    }
  }
  return s.toString(2);
}
```

## TypeScript
```ts
export function arr2bin(arr: any[]): string {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    if (typeof arr[i] === 'number') {
      s += arr[i];
    }
  }
  return s.toString(2);
}
```

## PHP
```php
function arr2bin($arr) {
  $sum = 0;
  foreach ($arr as $elt) {
    if (is_int($elt) || (is_float($elt) && is_nan($elt))) {
      $sum += $elt;
    }
  }
  if (is_float($sum) && is_nan($sum)) {
    return "NaN";
  }
  return decbin($sum);
}
```