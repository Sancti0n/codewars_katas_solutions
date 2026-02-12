https://www.codewars.com/kata/5a2e2499b6cfd7f828000014

## JavaScript
```js
function schoolSelection(array) {
  let d = {
    'Kindergarten': 0,
    '1st grade': 0,
    '2nd grade': 0,
    '3rd grade': 0,
    '4th grade': 0
  }
  for (let i=0;i<array.length;i++) {
    if (array[i] == 5) d['Kindergarten']++;
    if (array[i] == 6) d['1st grade']++;
    if (array[i] == 7) d['2nd grade']++;
    if (array[i] == 8) d['3rd grade']++;
    if (array[i] == 9) d['4th grade']++;
  }
  return d
}
```