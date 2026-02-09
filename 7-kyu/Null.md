https://www.codewars.com/kata/5dd73cd4cf95d3000194617d

## Java
```java
public class Null {
  
  @Override
  public int hashCode() {
    return 0;
  }
  
  @Override
  public String toString() {
    return "null";
  }
  
  @Override
  public boolean equals(Object obj) {
    return obj instanceof Null || obj == null;
  }
}
```