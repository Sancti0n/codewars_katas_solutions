https://www.codewars.com/kata/51e0007c1f9378fa810002a9

## Python
```python
def parse(data):
    v = 0
    t = []
    for j in data:
        if j == "o": t.append(v)
        elif j == "i": v += 1
        elif j == "d": v -= 1
        elif j == "s": v = v**2
    return t
```

## JavaScript
```js
function parse(data) {
  let t = [], v = 0;
  for (let j=0;j<data.length;j++) {
    if (data[j] == "o") t.push(v);
    else if (data[j] == "i") v++;
    else if (data[j] == "d") v--;
    else if (data[j] == "s") v *= v;
  }
  return t 
}
```

## TypeScript
```ts
export function parse(data: string): number[] {
  let t = [], v = 0;
  for (let j=0;j<data.length;j++) {
    if (data[j] == "o") t.push(v);
    else if (data[j] == "i") v++;
    else if (data[j] == "d") v--;
    else if (data[j] == "s") v *= v;
  }
  return t
}
```

## PHP
```php
function parse($data) {
  $t = [];
  $v = 0;
  for ($j=0;$j<strlen($data);$j++) {
    if ($data[$j] == "o") $t[] = $v;
    else if ($data[$j] == "i") $v++;
    else if ($data[$j] == "d") $v--;
    else if ($data[$j] == "s") $v *= $v;
  }
  return $t;
}
```