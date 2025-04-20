https://www.codewars.com/kata/57f5e7bd60d0a0cfd900032d

## JavaScript
```js
function missingNo(nums) {
  let v = Math.max(...nums)*(Math.max(...nums)+1)/2 - nums.reduce((p, c) => p + c, 0);
  return nums.indexOf(0)<0 ? 0 : v>0 ? v : Math.max(...nums) + 1 
}
```

## Python
```python
def missing_no(nums):
    v = max(nums)*(max(nums)+1)/2 - sum(nums)
    return 0 if 0 not in nums else v if v != 0 else max(nums)+1
```