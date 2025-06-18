https://www.codewars.com/kata/5a2be17aee1aaefe2a000151

## Python
```python
def array_plus_array(arr1,arr2):
    return sum(arr1)+sum(arr2)
```

## JavaScript
```js
function sumArr(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function arrayPlusArray(arr1, arr2) {
  return sumArr(arr1) + sumArr(arr2)
}
```

## Java
```java
public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i=0;i<arr1.length;i++) sum = sum + arr1[i] + arr2[i];
        return sum;
    }
}
```