https://www.codewars.com/kata/57277a31e5e51450a4000010

## JavaScript
```js
function firstToLast(str,c){
  if (str.indexOf(c) < 0) return -1
  return str.lastIndexOf(c) - str.indexOf(c)
}
```