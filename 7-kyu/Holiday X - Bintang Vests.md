https://www.codewars.com/kata/57e93e4a2aee4974d4000c2f

## JavaScript
```js
function vestBuy(price, haggle) {
  switch (haggle) {
    case "light":
      return Math.round(price*.8)
    case "medium":
      return Math.round(price*.7)
    case "heavy":
      return Math.round(price*.6)
    case "walkandswear":
      return Math.round(price*.1)
    default:
      return "Run!!"
  }
}
```