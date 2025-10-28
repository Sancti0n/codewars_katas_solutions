https://www.codewars.com/kata/58b972cae826b960a300003e

## Python
```python
def missing(nums, s):
    w = ""
    s = "".join(s.split(" ")).lower()
    i = 0
    nums.sort()
    while i<len(nums):
        if nums[i]>len(s): return "No mission today"
        w += s[nums[i]]
        i += 1
    return w
```

## JavaScript
```js
function missingWord(nums, s) {
  let w = "";
  s = s.split(" ").join("").toLowerCase();
  let i = 0;
  nums.sort((a,b)=>a-b);
  while (i<nums.length) {
    if (nums[i]>s.length) return "No mission today"
    w += s[nums[i]];
    i++;
  }
  return w
}
```