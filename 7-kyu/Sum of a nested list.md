https://www.codewars.com/kata/5a15a4db06d5b6d33c000018

## JavaScript
```js
const sumNested = arr => {
  return arr.flat(Infinity).reduce((p, c) => p + c, 0)
};
```