https://www.codewars.com/kata/5497a3c181dd7291ce000700

## Python
```python
def diagonal_sum(arr):
    return sum([arr[i][i] for i in range(len(arr))])
```

## JavaScript
```js
function diagonalSum(matrix) {
  let s = 0;
  for (let i=0;i<matrix.length;i++) {
    s += matrix[i][i];
  }
  return s
}
```

## Java
```java
public class Diagonal {
  public static int diagonalSum(final int[][] matrix) {
    int s = 0;
    for (int i=0;i<matrix.length;i++) {
      s += matrix[i][i];
    }
    return s;
  }
}
```