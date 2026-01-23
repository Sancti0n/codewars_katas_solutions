https://www.codewars.com/kata/59127598c0f53a738f0000e0

## JavaScript
```js
function compareIntegers(a, b) {
  return BigInt(a) == BigInt(b) ? "equal": BigInt(a) > BigInt(b) ? "greater" : "less"
}
```