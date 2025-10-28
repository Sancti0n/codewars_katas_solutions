https://www.codewars.com/kata/5868812b15f0057e05000001

## Python
```python
def tail_swap(strings):
    v1 = strings[0].split(":")[0] + ":" + strings[1].split(":")[1]
    v2 = strings[1].split(":")[0] + ":" + strings[0].split(":")[1]
    return [v1,v2]
```

## JavaScript
```js
function tailSwap(arr) {
  let v1 = arr[0].split(":")[0] + ":" + arr[1].split(":")[1];
  let v2 = arr[1].split(":")[0] + ":" + arr[0].split(":")[1];
  return [v1,v2]
}
```

## PHP
```php
function tail_swap(array $a): array {
  $v1 = explode(":", $a[0])[0] . ":" . explode(":", $a[1])[1];
  $v2 = explode(":", $a[1])[0] . ":" . explode(":", $a[0])[1];
  return [$v1,$v2];
}
```