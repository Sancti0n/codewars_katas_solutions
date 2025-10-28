https://www.codewars.com/kata/58fdc60ed94f25a863000092

## JavaScript
```js
function twins(arr) {
  let t = [...new Set(arr)]
  for (let i=0;i<t.length;i++) {
    if (arr.filter(e => e === t[i]).length != 2) return false
  }
  return true
}
```