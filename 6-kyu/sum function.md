https://www.codewars.com/kata/57ab606e53ba3339da0000a2

## JavaScript
```js
function sum(...x) {
  if (x.length>1) return x[0]+x[1]
  return function(y) {
    return x[0] + y
  };
}
```