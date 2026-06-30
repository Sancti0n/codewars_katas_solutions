https://www.codewars.com/kata/579387dc7cb7a1e592000112

## JavaScript
```js
function pidgeyCalc(pidgeys, candy) {
  let xp = 0;
  while (pidgeys>0) {
    if (candy>=12) {
      xp += 500;
      candy -= 11;
      pidgeys--;
    } else if (pidgeys+candy>12) {
      pidgeys--;
      candy++;
    } else {
      break;
    }
  }
  return xp
}
```