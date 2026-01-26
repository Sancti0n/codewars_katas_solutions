https://www.codewars.com/kata/59bdbe9d46038724ca0000b9

## JavaScript
```js
function solution(arr, options) {
  let t = []
  for (let i = 0; i < arr.length; ++i) {
    t.push(arr[i] + 2*options.modifier)
  }
  return t;
}
```