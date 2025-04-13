A non-empty array a of length n is called an array of all possibilities if it contains all numbers between 0 and a.length - 1 (both inclusive).

Write a function that accepts an integer array and returns true if the array is an array of all possibilities, else false.

## Java
```java
import java.util.Arrays;

public class Solution {
  public static boolean isAllPossibilities(int[] arg) {
    Arrays.sort(arg);
    if (arg.length-1 != arg[arg.length-1]) return false;
    for (int i=0;i<arg.length;i++) {
      if (arg[i] != i) return false;
    }
    return true;
	}
}
```

## JavaScript
```js
function isAllPossibilities(x) {
  if (x.length == 0) return false
  x.sort((a,b)=>a-b);
  let t = [...Array(x.length).keys()];
  return x.every((val, index) => val === t[index])
}
```

## Python
```python
def is_all_possibilities(arr):
    if len(arr) == 0: return False
    arr.sort()
    return list(range(0, len(arr))) == arr
```