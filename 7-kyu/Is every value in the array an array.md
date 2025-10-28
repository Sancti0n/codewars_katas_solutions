https://www.codewars.com/kata/582c81d982a0a65424000201

## Python
```python
def arr_check(arr):
    if len(arr)<1 and type(arr) is list: return True
    for i in arr:
        if type(i) is not list: return False
    return True
```

## JavaScript
```js
function deleteValues(array, pred) {
  let i = 0, l = array.length;
  while (i<l) {
    if (pred(array[i])) {
      array.splice(i, 1);
      l--;
      i--;
    }
    i++;
  }
  return array
}
```