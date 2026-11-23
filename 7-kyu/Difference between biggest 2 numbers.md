https://www.codewars.com/kata/55e3f27d5dee52d8dd0000a9

## JavaScript
```js
function diffBig2(arr) {
  if (arr.length<3) {
    return Math.abs(arr[0]-arr[1])
  }
  let b = -Infinity, c = -Infinity;
  for (let num of arr) {
    if (num >= b) {
        c = b;
        b = num;
    } else if (num > c && num < b) {
        c = num;
    }
  }
  return b-c
}
```