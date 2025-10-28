https://www.codewars.com/kata/556196a6091a7e7f58000018

## JavaScript
```js
function largestPairSum (arr) {
  arr.sort((a,b)=>a-b);
  return arr[arr.length-1]+arr[arr.length-2]
}
```

## Python
```python
def largest_pair_sum(arr):
    arr.sort()
    return arr[len(arr)-1]+arr[len(arr)-2]
```

## Java
```java
import java.util.Arrays;

public class Solution {
  public static int largestPairSum(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length-1]+arr[arr.length-2];
  }
}
```