https://www.codewars.com/kata/590e03aef55cab099a0002e8

## Python
```python
def incrementer(nums):
    return [(nums[x]+x+1)%10 for x in range(len(nums))]
```

## PHP
```php
function incrementer($nums) {
  for ($i=0;$i<count($nums);$i++) {
    $nums[$i] = ($nums[$i]+$i+1)%10;
  }
  return $nums;
}
```

## JavaScript
```js
function incrementer(nums) {
  for (let i=0;i<nums.length;i++) nums[i] = (nums[i]+i+1)%10;
  return nums
}
```

## Java
```java
public class Kata {
  public static int[] incrementer(int[] nums) {
    for (int i=0;i<nums.length;i++) nums[i] = (nums[i]+i+1)%10;
    return nums;
  }
}
```