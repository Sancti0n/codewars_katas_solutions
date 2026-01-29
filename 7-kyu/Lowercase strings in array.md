https://www.codewars.com/kata/5729fa716c7d26dc84000040

## JavaScript
```js
function arrayLowerCase(arr) {
  for (let i=0;i<arr.length;i++) {
    if (typeof arr[i] === 'string') {
      arr[i] = arr[i].toLowerCase();
    }
  }
  return arr
}
```