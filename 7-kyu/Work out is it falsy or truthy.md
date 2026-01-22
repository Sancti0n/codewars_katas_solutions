https://www.codewars.com/kata/583310c5dbeb310c34000352

## JavaScript
```js
function falsyOrTruthy(arr) {
  let n = arr.length, t = [];
  let e = [null, undefined, false, "", 0];
  if (n%2) {
    for (let i=0;i<n;i++) {
      if (arr[i] !== arr[i] || e.indexOf(arr[i])>-1) t.push(arr[i]);
    }
  }
  else {
    for (let i=0;i<n;i++) {
      if (arr[i] === arr[i] && e.indexOf(arr[i])<0) t.push(arr[i])
    }
  }
  return t
}
```