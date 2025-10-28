https://www.codewars.com/kata/572cb264362806af46000793

## JavaScript
```js
function sum(arr) {
  return arr[0]+arr[1]+arr[2]
}

function threeInOne(arr){
  let i = 0;
  let t = [];
  while (i<arr.length) {
    t.push(sum(arr.slice(i, i+3)));
    i += 3;
  }
  return t
}
```