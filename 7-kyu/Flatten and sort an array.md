https://www.codewars.com/kata/57ee99a16c8df7b02d00045f

## JavaScript
```js
"use strict";

function flattenAndSort(array) {
  let t = array.flat();
  return t.sort((a,b)=>a-b)
}
```

## Python
```python
def flatten_and_sort(array):
    t = [item for sublist in array for item in sublist]
    t.sort()
    return t
```