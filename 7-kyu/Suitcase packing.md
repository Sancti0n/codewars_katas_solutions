https://www.codewars.com/kata/5c556845d7e0334c74698706

## Python
```python
def fit_in(a, b, m, n):
    return a+b<=max(m,n) and max(a,b)<=min(m,n)
```

## JavaScript
```js
function fit_in(a, b, m, n) {
  return a+b<=Math.max(m,n) && Math.max(a,b)<=Math.min(m,n);
}
```

## Java
```java
public class MrSquare {
  public static Boolean fit_in(int a, int b, int m, int n) {
    return a+b<=Math.max(m,n) && Math.max(a,b)<=Math.min(m,n);
  }
}
```