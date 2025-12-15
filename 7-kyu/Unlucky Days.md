https://www.codewars.com/kata/56eb0be52caf798c630013c0

## JavaScript
```js
function unluckyDays(year){
  let b=0;
  for(let c=12;c--;) {
    b += !new Date(year, c, 1).getDay();
  }
  return b
}
```