https://www.codewars.com/kata/58bc8304b238c8e29b0000f6

## Java
```java
public class Sid {
  public static int sumOfElements(int matrix[][]) {
    int s = 0;
    for (int i=0;i<matrix.length;i++) {
      for (int j=0;j<matrix[i].length;j++) {
        s += matrix[i][j];
      }
    }
    return s;
  }    
}
```