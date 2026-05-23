https://www.codewars.com/kata/52378b3ee72f21e1ea000045

## JavaScript
```js
function min(a, b){
  if (typeof(a) == 'object') a = 0
  if (typeof(b) == 'object') b = 0
  if (a == undefined || b == undefined || isNaN(a) || isNaN(b)) return NaN
  return (a<b)?a:b;
}
```