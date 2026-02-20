https://www.codewars.com/kata/5174a4c0f2769dd8b1000003

## Python
```py
def solution(nums):
    if nums == None: return []
    nums.sort()
    return nums
```

## JavaScript
```js
function solution(nums){
  if (nums === null) return []
  return nums.sort(function(a, b) {return a - b;})
}
```

## PHP
```php
function solution($nums) {
  if ($nums == null) return [];
  sort($nums);
  return $nums;
}
```