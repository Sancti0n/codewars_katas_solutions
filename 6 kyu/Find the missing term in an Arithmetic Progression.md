https://www.codewars.com/kata/52de553ebb55d1fca3000371

## JavaScript
```js
function findMissing(list) {
  let p = (list[list.length-1] - list[0])/list.length
  for (let i=1;i<list.length;i++) {
    if (list[i] != list[i-1] + p) return list[i-1] + p
  }
}
```

## Python
```python
def find_missing(arr):
    p = (arr[len(arr)-1] - arr[0])/len(arr)
    for i in range(1, len(arr)):
        if arr[i] != arr[i-1] + p: return arr[i-1] + p
```

## Java
```java
public class Solution {
	public static int findMissing(int[] numbers) {
    if (numbers[0] == numbers[numbers.length-1]) return numbers[0];
    int p = (numbers[numbers.length-1] - numbers[0])/numbers.length;
    for (int i=1;i<numbers.length;i++) {
      if (numbers[i] != numbers[i-1] + p) return numbers[i-1] + p;
    }
    return 0;
	}
}
```