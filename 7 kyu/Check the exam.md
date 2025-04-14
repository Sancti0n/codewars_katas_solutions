https://www.codewars.com/kata/5a3dd29055519e23ec000074

## JavaScript
```js
function checkExam(arr1, arr2) {
  let s = 0;
  for (let i=0;i<arr1.length;i++) {
    if (arr1[i] == arr2[i]) s += 4;
    if (arr2[i] == "") s += 0
    else if (arr1[i] != arr2[i]) s -= 1;
  }
  if (s<0) return 0
  return s
}
```

## Python
```python
def check_exam(arr1,arr2):
    s = 0
    for i in range(len(arr1)):
        if arr1[i] == arr2[i]: s += 4
        elif arr1[i] != arr2[i] and arr2[i] != "": s -= 1
    return s if s>=0 else 0
```

## PHP
```php
function checkExam(array $array1, array $array2): int{
  $s = 0;
  for ($i=0;$i<count($array1);$i++) {
    if ($array1[$i] == $array2[$i]) $s += 4;
    if ($array2[$i] == "") $s += 0;
    else if ($array1[$i] != $array2[$i]) $s -= 1;
  }
  return $s>=0 ? $s: 0;
}
```