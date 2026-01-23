https://www.codewars.com/kata/5904d222e1bfd3354e000026

## JavaScript
```js
function countArr(arr, n) {
  return arr.filter(elt => elt === n).length;
}

function removeDuplication(arr) {
  let t = [...new Set(arr)], a = [];
  for (let i=0;i<t.length;i++) {
    if (countArr(arr, t[i]) == 1) a.push(t[i]);
  }
  return a
}

```