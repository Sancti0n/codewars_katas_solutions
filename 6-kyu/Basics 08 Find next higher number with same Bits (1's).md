https://www.codewars.com/kata/56bdd0aec5dc03d7780010a5

## JavaScript
```js
function nextHigher(n) {
  let rightOne, nextHigherOneBit, rightOnesPattern;
  rightOne = n & -n;
  nextHigherOneBit = n + rightOne;
  rightOnesPattern = n ^ nextHigherOneBit;
  rightOnesPattern = (rightOnesPattern)/rightOne;
  rightOnesPattern >>= 2;
  return nextHigherOneBit | rightOnesPattern
}
```