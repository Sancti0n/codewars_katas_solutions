https://www.codewars.com/kata/566fc12495810954b1000030

## Python
```python
def nb_dig(n, d):
    return sum(str(i*i).count(str(d)) for i in range(n+1))
```

## JavaScript
```js
function nbDig(n, d) {
  let [i, c, v] = [0, 0, 0];
  while (i<=n) {
    v = (i**2).toString();
    if ((v.match(new RegExp(d.toString(), "g")) || []).length>0) {
      for (let j=0;j<v.toString().length;j++) {
        if (v[j] === d.toString()) c++;
      }
    }
    i++;
  }
  return c
}
```

## PHP
```php
function nbDig(int $n, int $d) : int {
  $count = 0;
  for ($i=0;$i<=$n;$i++) {
    $count += substr_count((string)($i**2), (string)$d);
  }
  return $count;
}
```