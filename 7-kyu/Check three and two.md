https://www.codewars.com/kata/5a9e86705ee396d6be000091

## Java
```java
public class Solution {
  public int maxArr(int[] arr) {
    int max = arr[0];
    for (int i=1;i<arr.length;i++) {
        max = Math.max(max, arr[i]);
    }
    return max;
  }
  
  public int minArr(int[] arr) {
    int min = arr[0];
    for (int i=1;i<arr.length;i++) {
        min = Math.min(min, arr[i]);
    }
    return min;
  }
  
  public int countInArray(String a, char[] arr) {
    String s = new String(arr);
    return String.join("", s).length() - String.join("", s).replace(a, "").length();
  }
  
  public boolean checkThreeAndTwo(char[] arr) {
    int a = countInArray("a", arr);
    int b = countInArray("b", arr);
    int c = countInArray("c", arr);
    return maxArr(new int[] {a,b,c}) == 3 && minArr(new int[] {a,b,c}) == 0;
  }
}
```

## Python
```python
def check_three_and_two(arr):
    a = arr.count("a")
    b = arr.count("b")
    c = arr.count("c")
    return max(a,b,c) == 3 and min(a,b,c) == 0
```

## JavaScript
```js
function checkThreeAndTwo(arr) {
  let a = arr.filter(e => e === "a").length;
  let b = arr.filter(e => e === "b").length;
  let c = arr.filter(e => e === "c").length;
  return Math.max(a,b,c) == 3 && Math.min(a,b,c) == 0
}
```

## PHP
```php
function checkThreeAndTwo($arr) {
  $a = in_array("a", $arr) ? array_count_values($arr)["a"] : 0;
  $b = in_array("b", $arr) ? array_count_values($arr)["b"] : 0;
  $c = in_array("c", $arr) ? array_count_values($arr)["c"] : 0;
  return max($a,$b,$c) == 3 && min($a,$b,$c) == 0;
}
```