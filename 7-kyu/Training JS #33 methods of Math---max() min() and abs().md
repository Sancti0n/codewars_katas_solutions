https://www.codewars.com/kata/5733d6c2d780e20173000baa

## JavaScript
```js
function maxMin(arr1,arr2){
  let maxi = Math.abs(arr1[0]-arr2[0]);
  let mini = Math.abs(arr1[0]-arr2[0]);
  for (let i=1;i<arr1.length;i++) {
    if (maxi<Math.abs(arr1[i]-arr2[i])) maxi = Math.abs(arr1[i]-arr2[i]);
    if (mini>Math.abs(arr1[i]-arr2[i])) mini = Math.abs(arr1[i]-arr2[i]);
  }
  return [maxi, mini]
}
```