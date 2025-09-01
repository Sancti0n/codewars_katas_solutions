https://www.codewars.com/kata/5722b3f0bd5583cf44001000

## JavaScript
```js
function giveMeFive(obj){
  let t = []
  for (var v in obj) {
    if (v.length === 5) t.push(v)
    if (obj[v].length === 5) t.push(obj[v])
  }
  return t
}
```