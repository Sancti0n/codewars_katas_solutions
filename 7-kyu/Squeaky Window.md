https://www.codewars.com/kata/55f8b5b09ec923860200000f

## JavaScript
```js
function sliding(nums, k) {
  let t = [];
  for (let i=0;i<nums.length;i++) {
    if (i+k>nums.length) return t
    t.push(Math.max(...nums.slice(i, i+k)));
  }
  return t
}
```