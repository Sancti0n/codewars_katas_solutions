https://www.codewars.com/kata/584bf3b969ebc573ed00000f

## JavaScript
```js
function maxedOut(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    s += arr[i]**3
    if (s>= Number.MAX_SAFE_INTEGER) return "You've pushed me to the max!"
  }
  return s
}
```