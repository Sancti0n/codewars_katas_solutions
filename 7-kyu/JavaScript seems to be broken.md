https://www.codewars.com/kata/565d6d1696e154b51b000076

## JavaScript
```js
function semicolonSeparationToCommaSeparation(input) {
  let s = "";
  for (let i=0;i<input.length;i++) {
    if (i == 0) s += input[i];
    else if (input[i] != ";") s += "," + input[i];
  }
  return s
}
```