https://www.codewars.com/kata/58dd98fe8d29b0f30d0002bd

## JavaScript
```js
function objectType(...obj) { //if no arguments are passed, defaults to null
  return obj.length != 0 ? Object.prototype.toString.call(obj[0]): Object.prototype.toString.call(null)
}
```