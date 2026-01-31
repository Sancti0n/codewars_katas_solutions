https://www.codewars.com/kata/586427d883f7e6b5670001dc

## JavaScript
```js
function compute(n) {
  if (n<3 || n%2 == 0) return 0
  let s = 1;
  for (let i=3;i<=n;i+=2) {
    s += 1/(i)**2
  }
  return s
}
```