https://www.codewars.com/kata/5a1de8a580171fb29f00005e

## JavaScript
```js
function sortByArea(array) {
  let t = [];
  for (let i=0;i<array.length;i++) {
    if (Array.isArray(array[i])) {
      t.push(Math.round(array[i][0]*array[i][1]*100)/100);
    }
    else {
      t.push(Math.round(100*Math.PI*array[i]**2)/100);
    }
  }
  return t.sort((a,b)=>a-b)
}
```