https://www.codewars.com/kata/59a1cdde9f922b83ee00003b

## JavaScript
```js
function stantonMeasure(arr) {
  return arr.filter(elt => elt === arr.filter(elt => elt === 1).length).length
}
```

## Python
```python
def stanton_measure(arr):
    return arr.count((arr.count(1)))
```

## Java
```java
public class Kata {
  
  public static int countInArr(int[] arr, int v) {
    int count = 0;
    for (int i=0;i<arr.length;i++) if (arr[i] == v) count++;
    return count;
  }
  
  public static int stantonMeasure(int[] arr) {
    return countInArr(arr, countInArr(arr, 1));
  }
}
```