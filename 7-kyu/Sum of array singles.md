https://www.codewars.com/kata/59f11118a5e129e591000134

## Python
```python
def repeats(arr):
    s = 0
    for i in arr:
        if arr.count(i) == 1: s += i
    return s
```

## JavaScript
```js
function repeats(arr){
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    if (arr.filter(e => e === arr[i]).length == 1) s += arr[i];
  }
  return s
};
```

## Java
```java
class Solution {
  public static int repeats(int [] arr) {
    int s = 0;
    for (int i=0;i<arr.length;i++) {
      int c = 0;
      for (int num : arr) {
        if (num == arr[i]) {
          c++;
          if (c>1) break;
        }
      }
      if (c == 1) s += arr[i];
    }
    return s;
  }
}
```