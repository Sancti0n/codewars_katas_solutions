https://www.codewars.com/kata/6347f9715467f0001b434936

## Python
```py
def thin_or_fat(matrix):
    height = 0
    width = sum([sum(i)**.5 for i in matrix])
    l = len(matrix[0])
    i = 0
    while i<l:
        res = 0
        for j in matrix:
            res += j[i]
        height += res**.5
        i += 1
    if isinstance(width, complex) or isinstance(height, complex):
        return None
    return "perfect" if width == height else "fat" if height < width else "thin" 
```

## Java
```java
public class Solution {
  public static String thinOrFat(int[][] matrix) {
    double width = 0.0;
    double height = 0.0;
    double res = 0.0;
    int l = matrix[0].length;
    int i = 0;
    
    for (int j=0;j<matrix.length;j++) {
      res = 0.0;
      for (int k=0;k<matrix[j].length;k++) {
        res += matrix[j][k];
      }
      res = Math.sqrt(res);
      if (Double.isNaN(res)) {
        return null;
      }
      else {
        width += res;
      }
    }
    
    while (i<l) {
      res = 0.0;
      for (int m=0;m<matrix.length;m++) {
        res += matrix[m][i];
      }
      res = Math.sqrt(res);
      if (Double.isNaN(res)) {
        return null;
      }
      else {
        height += res;
      }
      i++;
    }
    return width == height ? "perfect" : height < width ? "fat" : "thin";
  }
}
```