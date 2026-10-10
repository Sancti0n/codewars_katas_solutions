https://www.codewars.com/kata/581270cb4927602fc800005a

## JavaScript
```js
String.prototype.reverse = function() {
  let s = "";
  for (let i=this.length-1;i>=0;i--) {
    s += this[i];
  }
  return s
}
```