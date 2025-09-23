https://www.codewars.com/kata/57882daf90b2f375280000ad

## JavaScript
```js
function SumSquares(l) {
  l = l.flat(Infinity);
  let s = 0;
  for (let i=0;i<l.length;i++) s += l[i]**2;
  return s
}
```