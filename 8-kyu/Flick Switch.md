https://www.codewars.com/kata/64fbfe2618692c2018ebbddb

## JavaScript
```js
function flickSwitch(arr) {
  let v = true
  for (let i=0;i<arr.length;i++) {
    if (arr[i] == 'flick') {
      arr[i] = !v;
      v = !v;
    }
    else arr[i] = v;
  }
  return arr
}
```