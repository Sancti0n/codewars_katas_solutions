https://www.codewars.com/kata/536ce83e2f403659a5000d47

## JavaScript
```js
function add (x, y) {
  if (!y) return x
  let sum = x ^ y
  let carry = (x & y) << 1
  return add(sum, carry);
}
```