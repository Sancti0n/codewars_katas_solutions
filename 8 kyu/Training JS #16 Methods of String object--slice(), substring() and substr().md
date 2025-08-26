https://www.codewars.com/kata/57274562c8dcebe77e001012

## JavaScript
```js
function cutIt(arr){
  let min = arr[0].length
  for (let i=1;i<arr.length;i++) {
    if (arr[i].length<min) min = arr[i].length
  }
  for (let j=0;j<arr.length;j++) {
    arr[j] = arr[j].substring(0,min)
  }
  return arr
}
```