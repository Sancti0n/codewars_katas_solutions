https://www.codewars.com/kata/59b710ed70a3b7dd8f000027

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