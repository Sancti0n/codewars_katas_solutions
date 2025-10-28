https://www.codewars.com/kata/5594463eaf1701909c0000d4

## JavaScript
```js
function arraySum(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    if (typeof arr[i] == "object") s += arraySum(arr[i]);
    if (!isNaN(arr[i])) s += arr[i];
  }
  return s
}
```