https://www.codewars.com/kata/57ea5b0b75ae11d1e800006c

## Python
```python
def sort_by_length(arr):
    arr.sort(key=len, reverse=False)
    return arr
```

## JavaScript
```js
function sortByLength (arr) {
  return arr.sort(function(a, b){return a.length - b.length});
};
```

## PHP
```php
function resort($a,$b){
    return strlen($a)-strlen($b);
}

function sortByLength ($arr) {
  usort($arr,'resort');
  return $arr;
};
```