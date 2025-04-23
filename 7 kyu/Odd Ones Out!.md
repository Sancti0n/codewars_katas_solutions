https://www.codewars.com/kata/5d376cdc9bcee7001fcb84c0

## Python
```python
def odd_ones_out(numbers):
    t = []
    for i in numbers:
        if numbers.count(i)%2 == 0: t.append(i)
    return t
```

## JavaScript
```js
function count(arr, a) {
  return arr.filter(e => e === a).length
}

function oddOnesOut(nums) {
  let t = [];
  for (let i=0;i<nums.length;i++) {
    if (count(nums, nums[i])%2 == 0) t.push(nums[i]);
  }
  return t
}
```