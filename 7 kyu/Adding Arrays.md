https://www.codewars.com/kata/59778cb1b061e877c50000cc

## JavaScript
```js
function arrAdder(arr) {
  let t = [];
  for (let i=0;i<arr[0].length;i++) {
    let w = '';
    for (let j=0;j<arr.length;j++) w += arr[j][i];
    t.push(w);
  }
  return t.join(' ')
}
```