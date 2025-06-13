https://www.codewars.com/kata/54598e89cbae2ac001001135

## JavaScript
```js
function any(arr, fun){
  for (let i=0;i<arr.length;i++) if (fun(arr[i])) return true
  return false
}
```