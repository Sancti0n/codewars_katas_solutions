https://www.codewars.com/kata/581214d54624a8232100005f

## Python
```py
def matrix(arr):
    for i in range(len(arr)):
        arr[i][i] = 1 if arr[i][i] >= 0 else 0
    return arr
```

## JavaScript
```js
function matrix(array) {
    for (let i=0; i<array.length; i++) {
      array[i][i] = array[i][i] < 0 ? 0 : 1
    }
    return array
}
```

## Java
```java
class CodeWars {
  public static int[][] matrix(int[][] array) {
    for (int i=0;i<array.length;i++) {
      array[i][i] = array[i][i] < 0 ? 0 : 1;
    }
    return array;
  }
}
```