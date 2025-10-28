https://www.codewars.com/kata/5925acf31a9825d616000e74

## JavaScript
```js
function killcount(counselors, jason){
  let t = [];
  for (let i=0;i<counselors.length;i++) {
    if (counselors[i][1]<jason) t.push(counselors[i][0]);
  }
  return t
}
```

## Python
```python
def kill_count(counselors, jason):
    t = []
    for i in range(len(counselors)):
        if counselors[i][1]<jason: t.append(counselors[i][0])
    return t
```

## PHP
```php
function killcount($counselors, $jason) {
  $t = [];
  for ($i=0;$i<count($counselors);$i++) {
    if ($counselors[$i][1]<$jason) $t[] = $counselors[$i][0];
  }
  return $t;
}
```