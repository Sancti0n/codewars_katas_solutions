https://www.codewars.com/kata/57ee4a67108d3fd9eb0000e7

## Python
```python
geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"]
def goose_filter(birds):
    t = []
    for i in birds:
        if i not in geese: t.append(i)
    return t
```

## PHP
```php
function gooseFilter($birds) {
  $geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"];
  $t = [];
  for ($i=0;$i<count($birds);$i++) {
    if (!in_array($birds[$i], $geese)) $t[] = $birds[$i];
  }
  return $t;
}
```

## JavaScript
```js
function gooseFilter (birds) {
  let geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"]
  let t = [];
  for (let i=0;i<birds.length;i++) {
    if (geese.indexOf(birds[i]) == -1) t.push(birds[i]);
  }
  return t
};
```