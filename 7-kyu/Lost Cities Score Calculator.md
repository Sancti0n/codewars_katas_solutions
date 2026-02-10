https://www.codewars.com/kata/59f8ffe9c9fc0eadc2000102

## JavaScript
```js
function calculateScore(cardsArr, wager) {
  if (cardsArr.length<1) {
    if (wager) return (-20)*(wager+1)
    else return 0
  }
  let s = -20;
  for (let i=0;i<cardsArr.length;i++) {
    s += cardsArr[i];
  }
  return s*(wager+1)
}
```