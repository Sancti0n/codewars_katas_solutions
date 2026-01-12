https://www.codewars.com/kata/5716afffb436cf11b7001937

## JavaScript
```js
function certainSum(a, b) {
  let x = Number.MAX_SAFE_INTEGER;
  if (Math.abs(a)>Math.abs(x) || Math.abs(b)>Math.abs(x) || Math.abs(a+b)>Math.abs(x)) return false
  return a + b
}
```