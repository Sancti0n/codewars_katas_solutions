https://www.codewars.com/kata/580878d5d27b84b64c000b51

## Python
```python
def sum_triangular_numbers(n):
    s = 0
    for i in range(1,n+1):
        s += i*(i+1)/2
    return s
```

## JavaScript
```js
function sumTriangularNumbers(n) {
  let s = 0;
  for (let i=1;i<=n;i++) s += i*(i+1)/2;
  return s
}
```

## Java
```java
public class Kata {
  public static int sumTriangularNumbers(int n) {
    int s = 0;
    for (int i=1;i<=n;i++) s += i*(i+1)/2;
    return s;
  }
}
```