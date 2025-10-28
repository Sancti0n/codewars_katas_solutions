https://www.codewars.com/kata/5a4138acf28b82aa43000117

## PHP
```php
function adjacentElementsProduct($array) {
  for ($i=0;$i<count($array);$i++) {
    if ($i == 0) $m = $array[$i]*$array[$i+1];
    if ($i+1 == count($array)) return $m;
    else {
      if ($array[$i]*$array[$i+1] > $m) $m = $array[$i]*$array[$i+1];
    }
  }
}
```

## JavaScript
```js
function adjacentElementsProduct(arr) {
  let a = 0;
  for (let i=0;i<arr.length;i++) {
    if (i == 0) a = arr[i]*arr[i+1];
    if (i+1 == arr.length) return a;
    else {
      if (arr[i]*arr[i+1] > a) a = arr[i]*arr[i+1];
    }
  }
}
```

## JavaScript
```js
def adjacent_element_product(arr):
    a = 0
    for i in range(len(arr)):
        if i == 0: a = arr[i]*arr[i+1]
        if i+1 == len(arr): return a
        else:
            if arr[i]*arr[i+1]>a: a = arr[i]*arr[i+1]
```