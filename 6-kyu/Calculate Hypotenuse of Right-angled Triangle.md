https://www.codewars.com/kata/525a3d6b85a9a47fcf00055a

## JavaScript
```js
function calculateHypotenuse(a, b) {
  if (isNaN(a) || isNaN(b) || a<=0 || b<=0 || typeof a == "boolean" || typeof b == "boolean") {
    throw new Error("Parameter is not a number!");
  }
  else {
    return Math.round(((a**2 + b**2)**.5)*1000)/1000
  }
}
```