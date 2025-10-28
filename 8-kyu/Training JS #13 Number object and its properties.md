https://www.codewars.com/kata/5722fd3ab7162a3a4500031f

## JavaScript
```js
function whatNumberIsIt(n) {
  if (Number(n) === 'Infinity') return "Input number is Number.POSITIVE_INFINITY"
  if (Number(n) === 1.7976931348623157e+308) return "Input number is Number.MAX_VALUE"
  if (Number(n) === 5e-324) return "Input number is Number.MIN_VALUE"
  if (isNaN(n)) return "Input number is Number.NaN"
  if (Number(n) === -Number.MAX_VALUE*2) return "Input number is Number.NEGATIVE_INFINITY"
  if (Number(n) === Infinity) return "Input number is Number.POSITIVE_INFINITY"
  return 'Input number is '+n
}
```