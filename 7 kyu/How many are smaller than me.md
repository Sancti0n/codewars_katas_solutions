https://www.codewars.com/kata/56a1c074f87bc2201200002e

## Python
```python
def smaller(arr):
    c = 0
    t = []
    for i in range(len(arr)):
        for a in range(i,len(arr)):
            if arr[i]>arr[a]: c += 1
        t.append(c)
        c = 0
    return t
```

## JavaScript
```js
function smaller(nums) {
  let c = 0;
  let t = [];
  for (let i=0;i<nums.length;i++) {
    for (let j=i;j<nums.length;j++) {
      if (nums[i]>nums[j]) c++;
    }
    t.push(c);
    c = 0;
  }
  return t
}
```