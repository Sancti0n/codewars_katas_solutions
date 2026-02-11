https://www.codewars.com/kata/563b8a23b554206f49000059

## JavaScript
```js
function horses(n) {
  if (!Number.isInteger(n)) return undefined
  if (n<3) return n
  return n*(n-1)*(n-2)
}
```