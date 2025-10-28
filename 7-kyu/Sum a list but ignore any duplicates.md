https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2

## Python
```python
def sum_no_duplicates(l):
    s = 0
    for i in range(len(l)):
        if l.count(l[i]) == 1: s += l[i]
    return s
```

## JavaScript
```js
function sumNoDuplicates(numList) {
  let s = 0;
  for (let i=0;i<numList.length;i++) {
    if (numList.filter(elt => elt === numList[i]).length == 1) s += numList[i];
  }
  return s
}
```

## Java
```java
import java.util.*;

public class Solution {
  public static int sumNoDuplicates(int[] arr) {
    IdentityHashMap<Integer,Integer> dict = new IdentityHashMap<>();
    for (int i=0;i<arr.length;i++) {
      if (dict.containsKey(arr[i])) {
        dict.put(arr[i], dict.get(arr[i]) + 1);
      }
      else {
        dict.put(arr[i], 1);
      }
    }
    int sum = 0;
    Iterator<IdentityHashMap.Entry<Integer, Integer> > itr = dict.entrySet().iterator();
    while (itr.hasNext()) {
      IdentityHashMap.Entry<Integer, Integer> entry = itr.next();
      if (entry.getValue() == 1) sum = sum + entry.getKey();
    }
    return sum;
  }
}
```