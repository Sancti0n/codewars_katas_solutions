https://www.codewars.com/kata/57a83e447cb1f32de80000d5

## JavaScript
```js
function lenR(x) {
  if (x.length == 0) return 0
  return 1 + lenR(x.slice(1))
}
```