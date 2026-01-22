https://www.codewars.com/kata/578fe7e2149935740f000525

## JavaScript
```js
function secondLargest(array) {
  if (!Array.isArray(array) || array.length<2) return undefined
  let t = [];
  for (let i=0;i<array.length;i++) {
    if (!isNaN(array[i]) && [null, false, true].indexOf(array[i])<0) t.push(parseInt(array[i]));
  }
  t.sort((a, b)=> b - a);
  let j = 1;
  while (j<t.length) {
    if (t[j-1] > t[j]) return t[j]
    if (j+1 == t.length) return undefined
    j++;
  }
}
```