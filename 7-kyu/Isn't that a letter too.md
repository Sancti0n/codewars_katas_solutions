https://www.codewars.com/kata/57cd273ee35eb97735000004

## JavaScript
```js
String.prototype.isLetter = function() {
  if (this.length>1) return false
  return this.toLowerCase() != this.toUpperCase()
}
```