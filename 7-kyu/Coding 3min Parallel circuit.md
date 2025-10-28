https://www.codewars.com/kata/571654c3347e6533fa00186b

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function resistance(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    s += 1/sum(arr[i])
  }
  return 1/s
}
```