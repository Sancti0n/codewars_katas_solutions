https://www.codewars.com/kata/5831200eb812b8016d000094

## JavaScript
```js
function smartSum(...arg) {
  return arg.flat(Infinity).reduce((p, c) => p + c, 0)
}
```