https://www.codewars.com/kata/5834315e06f227a6ac000099

## Python
```python
def elimination(arr):
    if len(arr) == len(list(set(arr))):
        return None
    for i in arr:
        if arr.count(i)>1: return i
```

## PHP
```php
function elimination($arr) {
  $t = array_unique($arr);
  if (count($t) == count($arr)) return null;
  for ($i=0;$i<count($arr);$i++) {
    if (array_count_values($arr)[$arr[$i]]>1) return $arr[$i];
  }
}
```

## JavaScript
```js
function elimination(arr){
  let t = [...new Set(arr)];
  if (t.length == arr.length) return null
  for (let i=0;i<arr.length;i++) {
    if (arr.filter(e => e === arr[i]).length > 1) return arr[i]
  }
}
```