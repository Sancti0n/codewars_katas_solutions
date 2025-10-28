https://www.codewars.com/kata/52c31f8e6605bcc646000082

## JavaScript
```js
function twoSum(n, v) {
  for (let i=0;i<n.length;i++) {
    for (let j=i+1;j<n.length;j++) {
      if (n[i]+n[j] === v) return [i,j]
    }
  }
}
```

## Python
```python
def two_sum(numbers, target):
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[i]+numbers[j] == target: return (i,j)
```

## Java
```java
public class Solution {
  public static int[] twoSum(int[] n, int v) {
    for (int i=0;i<n.length;i++) {
      for (int j=i+1;j<n.length;j++) {
        if (n[i]+n[j] == v) return new int[] {i,j};
      }
    }
    return null;
  }
}
```