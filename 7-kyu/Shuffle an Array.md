https://www.codewars.com/kata/566b51166f88d7560c00001a

## JavaScript
```js
function shuffle(arr) {
  arr.sort(() => Math.random() - 0.5);
  return arr
}
```