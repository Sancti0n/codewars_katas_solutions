https://www.codewars.com/kata/563c8540d50eb20bab00009a

## JavaScript
```js
function perc(mins) {
  if (typeof mins !== 'number' || isNaN(mins) || mins < 1 || mins > 100) {
    return "invalid track time";
  }
  let totalBars = mins * 30;
  let kicks = Math.round(totalBars * 4);
  let hihats = Math.round(totalBars * 8);
  let claps = Math.round(totalBars * 2);
  return [`${kicks} kicks`, `${hihats} hihats`, `${claps} claps`];
}
```