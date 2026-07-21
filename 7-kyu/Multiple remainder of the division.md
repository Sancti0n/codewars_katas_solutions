https://www.codewars.com/kata/5a2f83daee1aae4f1c00007e

## JavaScript
```js
function isMultiple(a, b, n) {
  let resultStr = (a/b).toFixed(1);
  let fractPart = parseInt(resultStr.split('.')[1]);
  return fractPart>0 && fractPart%n == 0;
}
```