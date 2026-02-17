https://www.codewars.com/kata/588ac50727eb94c87700001f

## JavaScript
```js
function consecutiveOnes(nums) {
  let maxCount = 0, currentCount = 0, l = nums.length;
  for (let i=0;i<l;i++) {
    if (nums[i] === 1) currentCount++;
    else {
      if (currentCount > maxCount) maxCount = currentCount;
      currentCount = 0;
      if (maxCount>=l-i) return maxCount
    }
  }
  if (currentCount>maxCount) return currentCount
  return maxCount
};
```