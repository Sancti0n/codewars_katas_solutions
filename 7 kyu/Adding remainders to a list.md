https://www.codewars.com/kata/5acc3634c6fde760ec0001f7

## Python
```python
def solve(nums, div):
    for i in range(len(nums)):
        if nums[i]%div != 0: nums[i] = nums[i]+nums[i]%div
    return nums
```

## JavaScript
```js
function solve(nums, div) {
  for (let i=0;i<nums.length;i++) {
    if (nums[i]%div != 0) nums[i] = nums[i]+nums[i]%div
  }
  return nums
}
```