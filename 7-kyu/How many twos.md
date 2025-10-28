https://www.codewars.com/kata/56aed5db9d5cb55de000001c

## JavaScript
```js
function twoCount(n) {
  let v = 0;
  while (Number.isInteger(n)) {
    n /= 2;
    v++;
  }
  return v-1
}
```