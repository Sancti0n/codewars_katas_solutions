https://www.codewars.com/kata/57164342794d30e78d000a20

## JavaScript
```js
function voltage(arr,total) {
  let s = 0, t = [];
  for (let i=0;i<arr.length;i++) {
    s += arr[i];
  }
  for (let j=0;j<arr.length;j++) {
    t.push(Math.round(100*total*arr[j]/s)/100);
  }
  return t
}
```