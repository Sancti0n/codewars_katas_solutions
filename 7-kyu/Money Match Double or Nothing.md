https://www.codewars.com/kata/5d378318e04cd7001ad72a27

## JavaScript
```js
function doubleOrNothing(cash, wager, losses) {
  if (losses === 0) return cash;
  let debt = wager * 2**(losses - 1);
  return debt > cash ? "I'll pay you back later" : cash - debt
}
```