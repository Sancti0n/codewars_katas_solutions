https://www.codewars.com/kata/55d277882e139d0b6000005d

## JavaScript
```js
var findAverage = function (nums) {
  return nums.reduce((p, c) => p + c, 0)/nums.length
}
```

## Python
```python
def find_average(nums):
    if len(nums) == 0: return 0
    return sum(nums)/len(nums)
```

## Java
```java
public class GrassHopper {
  public static int findAverage(int[] nums) {
    if (nums.length==0) return 0;
    int s = 0;
    for (int i=0;i<nums.length;i++) s = s + nums[i];
    return s/nums.length;
  }
}
```