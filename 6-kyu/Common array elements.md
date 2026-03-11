https://www.codewars.com/kata/5a6225e5d8e145b540000127

## JavaScript
```js
function common(a,b,c) {
  const countA = getCounts(a);
  const countB = getCounts(b);
  const countC = getCounts(c);
  let sum = 0;
  for (let num in countA) {
    if (countB[num] && countC[num]) {
      const minOccurrence = Math.min(countA[num], countB[num], countC[num]);
      sum += Number(num)*minOccurrence;
    }
  }
  return sum;
}

function getCounts(arr) {
  return arr.reduce((acc, val) => {
    acc[val] = (acc[val] || 0) + 1;
    return acc;
  }, {});
}
```