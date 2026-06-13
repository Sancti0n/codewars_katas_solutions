https://www.codewars.com/kata/59dc8288fc3c49cc3f000039

## JavaScript
```js
function sort(initialArray, sortingArray) {
  let f = new Array(initialArray.length)
  for (let i=0;i<f.length;i++) {
    let v = sortingArray.indexOf(i)
    f[i] = initialArray[v] 
  }
  return f
}
```