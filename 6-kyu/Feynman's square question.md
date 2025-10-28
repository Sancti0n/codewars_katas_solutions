https://www.codewars.com/kata/551186edce486caa61000f5c

## JavaScript
```js
function countSquares(n) {
  let v = 0;
  for(let i=1;i<=n;i++) {
    v += i*i;
  }
  return v
}
```

## Python
```python
def count_squares(n):
    return n*(n+1)*(2*n+1)/6
```

## Java
```java
public class FeynmanSquare {
  public static int countSquares(int n) {
    return n*(n+1)*(2*n+1)/6;
  }
}
```