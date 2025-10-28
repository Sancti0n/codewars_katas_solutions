https://www.codewars.com/kata/588502f87987a27f690001f7

## JavaScript
```js
function areEqual(s1, s2){
  if (s1.size != s2.size) return false
  for (const v of s1) {
    if (!s2.has(v)) return false
  }
  return true
}

function notEqual(s1, s2){
  return !areEqual(s1, s2)
}
```