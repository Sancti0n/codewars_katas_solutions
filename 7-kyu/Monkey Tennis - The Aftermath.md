https://www.codewars.com/kata/5a0c5b3206d5b696940000b8

## JavaScript
```js
function ballCollector(detritus) {
  let c = 0;
  for (let i=0;i<detritus.length;i++) {
    if (detritus[i] == 58) c++;
  }
  return {weight : c*58}
}
```