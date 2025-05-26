https://www.codewars.com/kata/56f8fe6a2e6c0dc83b0008a7

## JavaScript
```js
function sumSquares(a) {
  return a.map(x=>x**2).reduce((p,c)=>p+c,0)
}
```