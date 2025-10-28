https://www.codewars.com/kata/5697a0d35f754d1592000018

## JavaScript
```js
var isSquare = function(arr) {
  arr = arr.flat(Infinity);
  if (arr.length<1) return undefined
  for (let i=0;i<arr.length;i++) {
    if (parseInt(arr[i]**.5)**2 != arr[i]) return false
  }
  return true
}
```