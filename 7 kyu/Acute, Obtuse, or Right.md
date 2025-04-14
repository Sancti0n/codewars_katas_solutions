https://www.codewars.com/kata/5a2ef8b7b6486a7f2e00001c

## JavaScript
```js
function obtRhtAct(sideLen) {
  sideLen.sort((a,b)=>a-b);
  if (2*sideLen[2] >= sideLen[0] + sideLen[1] + sideLen[2]) return -1
  if ((sideLen[0]**2 + sideLen[1]**2) < sideLen[2]**2) return 0
  if ((sideLen[0]**2 + sideLen[1]**2) == sideLen[2]**2) return 1
  if ((sideLen[0]**2 + sideLen[1]**2) > sideLen[2]**2) return 2
}
```