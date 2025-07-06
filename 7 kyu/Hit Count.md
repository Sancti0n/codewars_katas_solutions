https://www.codewars.com/kata/57b6f850a6fdc76523001162/train/python

## Python
```python
def counter_effect(hit_count):
    return [list(range(int(i)+1)) for i in hit_count]
```

## JavaScript
```js
function counterEffect(hitCount) {
  let t = [];
  for (let i=0;i<hitCount.length;i++) {
    t.push([...Array(parseInt(hitCount[i])+1).keys()]);
  }
  return t
}
```

## PHP
```php
function counter_effect($hit_count) {
  $t = [];
  for ($i=0;$i<strlen($hit_count);$i++) {
    $t[] = range(0, intval($hit_count[$i]));
  }
  return $t;
}
```