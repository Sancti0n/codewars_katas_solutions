https://www.codewars.com/kata/56644a421b7c94c622000056

## JavaScript
```js
function mostLikely(prob1,prob2){
  return parseInt(prob1.split(":")[0])/parseInt(prob1.split(":")[1]) > parseInt(prob2.split(":")[0])/parseInt(prob2.split(":")[1])
}
```