https://www.codewars.com/kata/5ba38ba180824a86850000f7

## Python
```python
def solve(t):
    t.reverse()
    t = list(dict.fromkeys(t))
    t.reverse()
    return t
```

## JavaScript
```js
function solve(t) {
  t.reverse()
  t = [...new Set(t)]
  t.reverse()
  return t
}
```

## PHP
```php
function solve($arr) {
  return array_reverse(array_unique(array_reverse($arr)));
}
```