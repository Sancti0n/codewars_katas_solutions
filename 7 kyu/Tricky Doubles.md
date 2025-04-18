https://www.codewars.com/kata/56971747aa359bdbf800004d

## JavaScript
```js
function trickyDoubles(n) {
  if (n<11 || n.toString().length%2 == 1) return 2*n
  let a = n.toString().slice(0, n.toString().length/2);
  let b = n.toString().slice(n.toString().length/2, n.toString().length);
  return a == b ? n : 2*n
}
```