https://www.codewars.com/kata/58308360aeb69a460b0002b2

## JavaScript
```js
function unique(arr) {
  return arr.filter(function(a, pos) {
    return arr.indexOf(a) == pos;})
}
```