https://www.codewars.com/kata/5fd8aa5743b49e0012d43e50

## JavaScript
```js
function loopArr(arr, direction, steps) {
  let t = [];
  if (direction == "left") {
    t = (arr.splice(steps)).concat(arr.splice(0, steps));
  }
  else {
    let l = arr.length;
    t = (arr.splice(l-steps)).concat(arr.splice(0, l-steps))
  }
  return t
}
```