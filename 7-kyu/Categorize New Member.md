https://www.codewars.com/kata/5502c9e7b3216ec63c0001aa

## TypeScript
```ts
export function openOrSenior(data:number[][]):string[]{
  let t = [];
  for (let i=0;i<data.length;i++) {
    if (data[i][0]>=55 && data[i][1]>7) t.push('Senior');
    else t.push('Open');
  }
  return t
}
```

## Python
```py
def open_or_senior(data):
    return ["Senior" if age >= 55 and handicap > 7 else "Open" for (age, handicap) in data]
```

## JavaScript
```js
function openOrSenior(data){
  let t = [];
  for (let i=0;i<data.length;i++) {
    if (data[i][0]>=55 && data[i][1]>7) t.push('Senior');
    else t.push('Open');
  }
  return t
}
```

## PHP
```php
function open_or_senior(array $data): array {
  $t = [];
  for ($i=0;$i<count($data);$i++) {
    if ($data[$i][0]>=55 && $data[$i][1]>7) $t[] = "Senior";
    else $t[] = "Open";
  }
  return $t;
}
```