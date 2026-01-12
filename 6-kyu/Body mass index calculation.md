https://www.codewars.com/kata/55f810474dc34c5a25000016

## JavaScript
```js
function calculateBmi(weight, height) {
  let v = weight*10000/(height**2);
  for (let i=0;i<DATA.length;i++) {
    if (v >= DATA[i][0] && v <= DATA[i][1]) return {"value": v.toFixed(1), "category": DATA[i][2]}
  }
}
```