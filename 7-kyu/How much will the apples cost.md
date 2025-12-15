https://www.codewars.com/kata/58d298e5cbc278e6d8000005

## JavaScript
```js
function apples(kilos, price) {
  if (kilos<1) return kilos*price
  if (kilos<3) return kilos*price*.95
  if (kilos<5) return kilos*price*.9
  if (kilos<7) return kilos*price*.85
  if (kilos<9) return kilos*price*.8
  if (kilos<11) return kilos*price*.75
  if (kilos<13) return kilos*price*.7
}
```