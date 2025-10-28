https://www.codewars.com/kata/58d248c7012397a81800005c

## Python
```python
def cube_checker(volume, side):
    if side<1: return False
    return volume == side**3
```

## PHP
```php
function cubeChecker($volume, $side){
  if ($side<1) return false;
  return $volume == $side**3;
}
```

## JavaScript
```js
var cubeChecker = function(volume, side){
  return volume == side**3 && side > 0
};
```