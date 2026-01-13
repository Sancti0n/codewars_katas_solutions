https://www.codewars.com/kata/57293671c98f77e84b000065

## JavaScript
```js
function type(value) {
  if (value == null || value == undefined) return value + ""
  if (typeof value == "object") {
    if (Array.isArray(value)) return "array"
    if (!isNaN(value)) return "date"
    else return "object"
  }
  return typeof value;
}
```