https://www.codewars.com/kata/55c098aa8468f3b9030000f1

## JavaScript
```js
function move_zeros(arrNum, isRight=true) {
  let c = 0, t = [];
  for (let i=0;i<arrNum.length;i++) {
    if (arrNum[i] != 0) t.push(arrNum[i]);
    else c++;
  }
  let t0 = new Array(c).fill(0);
  if (isRight) return t.concat(t0)
  else return t0.concat(t)
}
```