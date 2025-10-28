https://www.codewars.com/kata/580a4734d6df748060000045

## JavaScript
```js
function isSortedAndHow(array) {
  let arr = [...array];
  if (JSON.stringify(array) == JSON.stringify(arr.sort((a,b)=>a-b))) return 'yes, ascending'
  if (JSON.stringify(array) == JSON.stringify(arr.sort((a,b)=>b-a))) return 'yes, descending'
  return 'no'
}
```

## Python
```python
def is_sorted_and_how(arr):
    array = arr.copy()
    array.sort(reverse=False)
    if arr == array: return 'yes, ascending'
    array.sort(reverse=True)
    if arr == array: return 'yes, descending'
    return 'no'
```

## Java
```java
import java.util.Arrays;
import java.util.Collections;

class Solution {
  public static String isSortedAndHow(int[] array) {
    int[] arr = Arrays.copyOfRange(array, 0, array.length);
    Arrays.sort(arr);
    if (Arrays.equals(arr, array)) return "yes, ascending";
    int[] r = new int[arr.length];
    for(int i=0;i<arr.length; i++) {
      r[i] = arr[arr.length-i-1];
    }
    if (Arrays.equals(r, array)) return "yes, descending";
    return "no";
      
  }
}
```