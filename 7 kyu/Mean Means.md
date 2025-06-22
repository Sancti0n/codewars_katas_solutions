https://www.codewars.com/kata/57c6b44f58da9ea6c20003da

## Python
```python
def geo_mean(nums, arith_mean):
    x = arith_mean*(len(nums)+1)-sum(nums)
    v = 1
    for i in nums:
        v *= i
    return (v*x)**(1/(len(nums)+1))
```

## JavaScript
```js
function geo_mean(nums, arith_mean) {
  let x = arith_mean*(nums.length+1)-nums.reduce((p, c) => p + c, 0);
  let v = 1;
  for (let i=0;i<nums.length;i++) v *= nums[i];
  return (v*x)**(1/(nums.length+1))
}
```