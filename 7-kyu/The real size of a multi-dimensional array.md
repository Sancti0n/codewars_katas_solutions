https://www.codewars.com/kata/57f032307b45ef9c8f0001dd

## JavaScript
```js
function realSize(arrays) {
  arrays = arrays.flat(Infinity)
  let s = 0;
  for (let i=0;i<arrays.length;i++) {
    if (Number.isInteger(arrays[i])) {
      s++;
    }
  }
  return s
}
```