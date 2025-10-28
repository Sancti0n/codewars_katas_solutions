https://www.codewars.com/kata/5f70c883e10f9e0001c89673

## JavaScript
```js
const flip=(d, arr)=>{
  arr.sort(function(a, b) {return a - b;});
  if (d == 'R') return arr
  return arr.reverse()
}
```

## Python
```python
def flip(d, a):
    if d == 'R':
        a.sort(reverse=False)
        return a
    a.sort(reverse=True)
    return a
```

## PHP
```php
function flip(string $dir, array $arr): array {
  if ($dir == 'R') {
    sort($arr);
    return $arr;
  }
  rsort($arr);
  return $arr;
}
```