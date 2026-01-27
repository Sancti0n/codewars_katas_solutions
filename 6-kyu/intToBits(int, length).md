https://www.codewars.com/kata/538865ef0b24c5ce6a00070d

## JavaScript
```js
function intToBits(int, length=32) {
  if (Number.isInteger(int)) {
    if (!Number.isInteger(length) || parseInt(length) <= 0 || parseInt(length) > 32) {
      return ((int >>> 0).toString(2)).padStart(32, "0")
    }
    return ((int >>> 0).toString(2)).padStart(length, "0")
  }
  return null
}
```