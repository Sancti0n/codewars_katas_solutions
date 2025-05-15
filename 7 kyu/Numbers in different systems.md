https://www.codewars.com/kata/588bb1195eb601f5d400001f

## JavaScript
```js
function sysNums(n, sys) {
  n = n.toString(sys)
  if (!isNaN(n) && n.indexOf("e")<0) return parseInt(n)
  return n
}
```