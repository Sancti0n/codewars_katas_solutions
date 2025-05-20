https://www.codewars.com/kata/5a34b80155519e1a00000009

## Python
```python
def multiple_of_index(arr):
    t = []
    for i in range(1, len(arr)):
        if arr[i]/i == int(arr[i]/i): t.append(arr[i])
    return t
```

## JavaScript
```js
function multipleOfIndex(arr) {
  let t = [];
  for (let i=1;i<arr.length;i++) {
    if (arr[i]/i == parseInt(arr[i]/i)) t.push(arr[i]);
  }
  return t
}
```

## PHP
```php
function multipleOfIndex(array $arr) : array {
  $t = [];
  for ($i=0;$i<count($arr);$i++) {
    if ($i==0 && $arr[$i]==0) $t[] = $arr[$i];
    else if ($i!=0 && $arr[$i]/$i == intval($arr[$i]/$i)) $t[] = $arr[$i];
  }
  return $t;
}
```