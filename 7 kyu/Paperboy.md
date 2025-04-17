https://www.codewars.com/kata/56ed5f13c4e5d6c5b3000745

## JavaScript
```js
function cheapestQuote(newspapers) {
  let s = 0;
  while (newspapers>0) {
    if (newspapers>=40) {
      s += 3.85;
      newspapers -= 40;
    }
    else if (newspapers>=20) {
      s += 1.93;
      newspapers -= 20;
    }
    else if (newspapers>=10) {
      s += 0.97;
      newspapers -= 10;
    }
    else if (newspapers>=5) {
      s += 0.49;
      newspapers -= 5;
    }
    else if (newspapers>=1) {
      s += 0.1;
      newspapers -= 1;
    }
  }
  return Math.round(s*100)/100
}
```