https://www.codewars.com/kata/57256064856584bc47000611

## JavaScript
```js
function howManySmaller(arr,n){
  let c = 0;
  for (let i=0;i<arr.length;i++) {
    if (n > arr[i].toFixed(2)) c++;
  }
  return c
}
```